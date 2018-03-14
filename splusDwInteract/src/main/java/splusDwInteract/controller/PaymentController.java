package splusDwInteract.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

import splusDwInteract.configuration.PaypalPaymentIntent;
import splusDwInteract.configuration.PaypalPaymentMethod;
import splusDwInteract.service.PaypalService;
import splusDwInteract.util.URLUtils;

@Controller
public class PaymentController {
	
	public static final String PAYPAL_SUCCESS_URL = "pay/success";
	public static final String PAYPAL_CANCEL_URL = "pay/cancel";
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PaypalService paypalService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/pay")
	public String pay(HttpServletRequest request){
		
		System.out.println("in pay ...................");
		String cancelUrl = URLUtils.getBaseURl(request) + "/" + PAYPAL_CANCEL_URL;
		String successUrl = URLUtils.getBaseURl(request) + "/" + PAYPAL_SUCCESS_URL;
		try {
			Payment payment = paypalService.createPayment(
					4.00, 
					"USD", 
					PaypalPaymentMethod.paypal, 
					PaypalPaymentIntent.sale,
					"payment description", 
					cancelUrl, 
					successUrl);
			for(Links links : payment.getLinks()){
				if(links.getRel().equals("approval_url")){
					String s=links.getHref();
					return "redirect:" + links.getHref();
					
				}
			}
		} catch (PayPalRESTException e) {
			log.error(e.getMessage());
		}
		
		System.out.println("before return of pay");
		return "redirect:/";
		
	}

	@RequestMapping(method = RequestMethod.GET, value = PAYPAL_CANCEL_URL)
	public String cancelPay(){
		return "cancel";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method = RequestMethod.GET, value = "/pay/success")
	public ResponseEntity successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId){
		
		System.out.println("Payment is sucessfull..........");
		try {
			Payment payment = paypalService.executePayment(paymentId, payerId);
			if(payment.getState().equals("approved")){
				//return "success manas";
				return new ResponseEntity(payment, HttpStatus.OK);
			}
		} catch (PayPalRESTException e) {
			log.error(e.getMessage());
		}
	//	return "redirect:/";*/
	//	return "Payment done Successfully";
		return new ResponseEntity("Done", HttpStatus.OK);
		
		
	}
	
}
