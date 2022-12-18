package ho.pte.pteprogmoditalbolt.repository;

import ho.pte.pteprogmoditalbolt.modell.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select p from Product p where p.Name like %:keyword%")
    List<Product> fingByKeyword(String keyword);
}
