/**
 * 
 */
package splusDwInteract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author dhiraj.bangar
 *
 */
@Entity
//@Data
@Table(name="ADDRESS")
public class Address {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private String id;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	
	
	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + ", street="
				+ street + ", zipCode=" + zipCode + ", addressLine1=" + addressLine1 + "]";
	}

	
	

}
