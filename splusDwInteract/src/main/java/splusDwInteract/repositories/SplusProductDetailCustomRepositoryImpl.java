package splusDwInteract.repositories;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Product;
import splusDwInteract.model.ProductDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nehal.Shah
 *
 */
@Service
public class SplusProductDetailCustomRepositoryImpl implements SplusProductDetailCustomRepository{
	
	private final NamedParameterJdbcTemplate jdbcTemplate;

	 @Autowired
	 SplusProductDetailCustomRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate = jdbcTemplate;
	 }
	 
	@Transactional(readOnly = true)
	@Override
	public List<ProductDetail> getProductDetail(String id) {
		 Map<String, String> queryParams = new HashMap<>();
		  queryParams.put("searchTerm", "");

		 List<ProductDetail> searchResults = (List<ProductDetail>) jdbcTemplate.query("SELECT PRODUCT_DETAIL_ID AS id FROM PRODUCT_DETAIL WHERE PRODUCT_ID = "+id,
		    queryParams,
		    new BeanPropertyRowMapper<>(ProductDetail.class)
		    );
		  
		  return searchResults;
	}

	@Override
	public List<ProductDetail> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetail> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetail> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends ProductDetail> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<ProductDetail> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDetail getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductDetail> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ProductDetail arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends ProductDetail> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductDetail findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends ProductDetail> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends ProductDetail> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductDetail> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = true)
	@Override
	public ProductDetail getProductandProductDetail(String pid, String pdid) {
		 Map<String, String> queryParams = new HashMap<>();
		  queryParams.put("PRODUCT_ID", pid);
		  queryParams.put("PRODUCT_DETAIL_ID", pdid);
		  
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select pd.PRODUCT_DETAIL_ID,pd.DW_ID,pd.POS_ID,pd.PRODUCT_SIZE,pd.PRODUCT_TYPE,pd.PRODUCT_WIDTH,p.PRODUCT_ID,p.PRODUCT_NAME,p.PRODUCT_DESCRIPTION from PRODUCT_DETAIL pd,product p where p.PRODUCT_ID= :PRODUCT_ID and pd.PRODUCT_DETAIL_ID= :PRODUCT_DETAIL_ID",queryParams);

		ProductDetail productDetail = new ProductDetail();
		
		for (Map row : rows) {
			
			productDetail.setId(((String)row.get("PRODUCT_DETAIL_ID")));
			productDetail.setProductSize((String)row.get("PRODUCT_SIZE"));
			productDetail.setProductType((String)row.get("PRODUCT_TYPE"));
			productDetail.setProductWidth((String)row.get("PRODUCT_WIDTH"));
			productDetail.setPosId((String)row.get("POS_ID"));
			productDetail.setDwId((String)row.get("DW_ID"));
			
			Product product=new Product();
			
			product.setProductId((String)row.get("PRODUCT_ID"));
			product.setProductName((String)row.get("PRODUCT_NAME"));
			product.setProductDescription((String)row.get("PRODUCT_DESCRIPTION"));
			
			productDetail.setProduct(product);
		}
		
		return productDetail;
	}

}
