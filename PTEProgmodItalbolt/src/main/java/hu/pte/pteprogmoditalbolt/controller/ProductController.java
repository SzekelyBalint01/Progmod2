package hu.pte.pteprogmoditalbolt.controller;

import hu.pte.pteprogmoditalbolt.dto.ProductDto;
import hu.pte.pteprogmoditalbolt.modell.Product;
import hu.pte.pteprogmoditalbolt.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllItem(){
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/products")
    public ResponseEntity<Void> creatNewItem(@RequestBody ProductDto productDto){
        Product createdProduct = productService.createProduct(productDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(createdProduct.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody ProductDto productDto){
        Product updatedProduct = productService.updateProductById(id, productDto);
        return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id){
        productService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
