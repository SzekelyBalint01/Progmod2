package ho.pte.pteprogmoditalbolt.controller;

import ho.pte.pteprogmoditalbolt.modell.Product;
import ho.pte.pteprogmoditalbolt.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllItem(){
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }
}
