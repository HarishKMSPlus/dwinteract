package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Repository
final class SplusInventoryCustomRepositoryImpl implements SplusInventoryCustomRepository{

	//	/ private static final String SEARCH_TODO_ENTRIES = "SELECT * FROM test.inventory WHERE STORE_ID = 2 LIMIT 1";

	private final NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	SplusInventoryCustomRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional(readOnly = true)
	@Override
	public Inventory findBystoreId(String id) {
		
		Map<String, String> queryParams = new HashMap<>();
		
		queryParams.put("searchTerm", "");
		List<Inventory> searchResults = jdbcTemplate.query("SELECT INVENTORY_ID AS id,PRODUCT_QTY AS productQty FROM inventory WHERE STORE_ID = "+id,
				queryParams,
				new BeanPropertyRowMapper<>(Inventory.class)
				);
		if(!searchResults.isEmpty()) {
			
			return searchResults.get(0);
		}else {
			return null;
		}
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Inventory> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inventory> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inventory> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inventory getOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Inventory> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Inventory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Inventory> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Inventory> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Inventory> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Inventory> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
