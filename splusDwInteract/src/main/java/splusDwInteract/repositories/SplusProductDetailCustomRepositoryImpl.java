package splusDwInteract.repositories;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Inventory;
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

}
