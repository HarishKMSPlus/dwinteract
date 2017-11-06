package splusDwInteract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST")
public class Test {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="STORE_ID")
	private String storeId;
	
	@Column(name="PROD_ID")
	private String prodId;
	
	@Column(name="STORE_NAME")
	private String storeName;

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "Test [storeId=" + storeId + ", prodId=" + prodId + ", storeName=" + storeName + "]";
	}
	
	
}
