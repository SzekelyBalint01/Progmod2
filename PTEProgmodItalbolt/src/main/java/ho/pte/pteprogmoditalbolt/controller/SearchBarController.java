package ho.pte.pteprogmoditalbolt.controller;

import ho.pte.pteprogmoditalbolt.modell.Product;
import ho.pte.pteprogmoditalbolt.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "searchBar")
public class SearchBarController {
    ProductService productService;

    public SearchBarController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProductsByKeyword(@RequestParam String keyword){
        List<Product> products = productService.findByKeyword(keyword);
        return ResponseEntity.ok(products);
    }
}
