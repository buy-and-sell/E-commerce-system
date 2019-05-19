package com.anjuc.utils.Product;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value= "/utils/products", params = "product_code" )
    public ResponseEntity<Product> getProductByProductCode (@RequestParam(name = "product_code")String productCode){
        return new ResponseEntity<> (productService.getProductByProductCode(productCode), HttpStatus.OK);
    }
    @GetMapping("utils/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @PostMapping("utils/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.createProduct(product), HttpStatus.OK);
    }

    @PutMapping("utils/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
        return new ResponseEntity<Product>(productService.updateProduct(id, product),HttpStatus.OK);
    }
}
