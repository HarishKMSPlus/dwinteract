package splusDwInteract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Its a model class which create Store table and its attributes.
 * @author Dhiraj Bangar
 */

@Entity
//@Data
@Table(name="STORE")
public class Store {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="STORE_ID")
	private String storeId;
	
	@Column(name="STORE_NAME")
	private String storeName;
	
	@Column(name="STORE_TYPE")
	private String storeType;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	
	@Column(name="PRODUCT_ID")
	private String productId;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStoreId() {
		return storeId;
	}
	
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getStoreType() {
		return storeType;
	}
	
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	
	
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeType=" + storeType + ", quantity="
				+ quantity + ", productId=" + productId + ", address=" + address + "]";
	}

	

	

}
