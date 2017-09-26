package splusDwInteract.model;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author dhiraj.bangar
 *
 **/
@Entity
//@Data
@Table(name="INVENTORY")
public class Inventory {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="INVENTORY_ID")
	private String id;
	
	
	
	
	@OneToOne
	@JoinColumn(name = "STORE_ID")
	private Store store;
	
	@Column(name="PRODUCT_QTY")
	private String productQty;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "INVENTORY_PRODUCTDETAIL", joinColumns = { @JoinColumn(name = "INVENTORY_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRODUCT_DETAIL_ID") })
	private Set<ProductDetail> products;
	
	
	
	
}
