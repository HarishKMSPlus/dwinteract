
package splusDwInteract.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@Column(name="PRODUCT_SIZE")
	private String productSize;
	
	@Column(name="PRODUCT_TYPE")
	private String productType;
	
	@Column(name="PRODUCT_WIDTH")
	private String productWidth;
	
	
	

	
}
