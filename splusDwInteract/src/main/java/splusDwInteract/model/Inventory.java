package splusDwInteract.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Its a model class which create inventory table and its attributes.
 * @author Nehal.Shah
 */

@Entity
//@Data
@Table(name="INVENTORY")
public class Inventory {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="INVENTORY_ID")
	private String id;
	
	//@Column(name="Inventory_Type")
	//private String inventoryType;
	
	@OneToOne
	@JoinColumn(name = "STORE_ID")
	private Store store;
	
	@Column(name="PRODUCT_QTY")
	private String productQty;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "INVENTORY_PRODUCTDETAIL", joinColumns = { @JoinColumn(name = "INVENTORY_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRODUCT_DETAIL_ID") })
//	private Set<ProductDetail> products;
	
	@OneToMany(mappedBy = "inventory")
	@JsonIdentityInfo(
			  generator = ObjectIdGenerators.PropertyGenerator.class, 
			  property = "id")
	private Set<InventoryProductDetail> inventoryProductDetail = new HashSet<InventoryProductDetail>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
/*
	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
*/
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getProductQty() {
		return productQty;
	}

	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}

//	public Set<ProductDetail> getProducts() {
//		return products;
//	}
//
//	public void setProducts(Set<ProductDetail> products) {
//		this.products = products;
//	}

	public Set<InventoryProductDetail> getInventoryProductDetail() {
		return inventoryProductDetail;
	}

	public void setInventoryProductDetail(Set<InventoryProductDetail> inventoryProductDetail) {
		this.inventoryProductDetail = inventoryProductDetail;
	}

	
}
