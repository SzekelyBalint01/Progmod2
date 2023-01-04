package hu.pte.pteprogmoditalbolt.service;

import hu.pte.pteprogmoditalbolt.dto.ProductDto;
import hu.pte.pteprogmoditalbolt.modell.Product;
import hu.pte.pteprogmoditalbolt.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    private static int idCounter = 0;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findByKeyword(String keyword){
        return productRepository.findByKeyword(keyword);
    }

    public List<Product> findAll(){
       return productRepository.findAll();
    }

    @Transactional
    public Product createProduct(ProductDto productDto){

        Product newProduct = Product.builder().Name(productDto.getName()).Description(productDto.getDescription()).Price(productDto.getPrice()).imageSrc(productDto.getImageSrc()).Type(productDto.getType()).Hero(productDto.getHero()).Size(productDto.getSize()).alcoholPercent(productDto.getAlcoholPercent()).placeOfOrigin(productDto.getPlaceOfOrigin()).build();
        productRepository.save(newProduct);

        return newProduct;
    }

    public Product deleteUserById(Integer id){

        Product product = productRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
        productRepository.deleteById(id);

        return product;
    }

    public Product updateProductById(Integer id, ProductDto productDto){

        Product product =  productRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());

            product.setName(productDto.getName());
            product.setDescription(productDto.getDescription());
            product.setPrice(productDto.getPrice());
            product.setImageSrc(productDto.getImageSrc());
            product.setType(productDto.getType());
            product.setHero(productDto.getHero());
            product.setSize(productDto.getSize());
            product.setAlcoholPercent(productDto.getAlcoholPercent());
            product.setPlaceOfOrigin(productDto.getPlaceOfOrigin());

        productRepository.save(product);

        return product;
    }


}
