package splusDwInteract.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_PRODUCT_DETAIL")
public class InventoryProductDetail {

	@Id
    @GeneratedValue	
    @Column(name = "INVENTORY_PD_ID")
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "INVENTORY_ID")
	private Inventory inventory;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_DETAIL_ID")
	private ProductDetail productDetail;
	
	@Column(name = "PRODUCT_QTY")
	private String productQty;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	
	public String getProductQty() {
		return productQty;
	}

	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	
	
}
