package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.ProductDetail;

@Repository
public interface SplusProductDetailCustomRepository extends JpaRepository<ProductDetail, String> {

	List<ProductDetail> getProductDetail(String id);
}
