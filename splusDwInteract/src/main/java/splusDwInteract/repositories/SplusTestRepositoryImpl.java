package splusDwInteract.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import splusDwInteract.model.ProductDetail;
import splusDwInteract.model.Test;

@Service
public class SplusTestRepositoryImpl implements SplusTestRepository{
	
	private final NamedParameterJdbcTemplate jdbcTemplate;

	 @Autowired
	 SplusTestRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate = jdbcTemplate;
	 }
	 
	@Transactional(readOnly = true)
	public List<Test> getStore(String id) {
		 Map<String, String> queryParams = new HashMap<String, String>();
		  queryParams.put("searchTerm", "");

		 List<Test> searchResults = (List<Test>) jdbcTemplate.query("SELECT STORE_NAME AS storeName FROM TEST WHERE PROD_ID = "+id,
		    queryParams,
		    new BeanPropertyRowMapper<>(Test.class)
		    );
		  
		  return searchResults;
	}
	
	public List<Test> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Test> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Test> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Test> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInBatch(Iterable<Test> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public Test getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Test> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Test findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Test entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Test> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Test> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Test> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Test> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
