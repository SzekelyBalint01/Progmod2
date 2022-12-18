package ho.pte.pteprogmoditalbolt.service;

import ho.pte.pteprogmoditalbolt.modell.Product;
import ho.pte.pteprogmoditalbolt.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findByKeyword(String keyword){
        return productRepository.fingByKeyword(keyword);
    }

    public List<Product> findAll(){
       return productRepository.findAll();
    }

}
