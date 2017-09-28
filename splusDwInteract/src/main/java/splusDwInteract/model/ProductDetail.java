
package splusDwInteract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author dhiraj.bangar
 *
 **/
@Entity
//@Data
@Table(name="PRODUCT_DETAIL")
public class ProductDetail {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="PRODUCT_DETAIL_ID")
	private String id;

	@Column(name="PRODUCT_SIZE")
	private String productSize;
	
	@Column(name="PRODUCT_TYPE")
	private String productType;
	
	@Column(name="PRODUCT_WIDTH")
	private String productWidth;
	
	@Column(name="POS_ID")
	private String posId;
	
	@Column(name="DW_ID")
	private String dwId;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductWidth() {
		return productWidth;
	}

	public void setProductWidth(String productWidth) {
		this.productWidth = productWidth;
	}

	public String getPosId() {
		return posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getDwId() {
		return dwId;
	}

	public void setDwId(String dwId) {
		this.dwId = dwId;
	}

	
}
