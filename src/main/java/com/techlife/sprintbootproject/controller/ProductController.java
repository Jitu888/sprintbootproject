package com.techlife.sprintbootproject.controller;

import com.techlife.sprintbootproject.model.Product;
import com.techlife.sprintbootproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
   @Autowired
    private ProductService productService;

   @PostMapping("/add")
   public Product addProduct(@RequestBody Product product){
     return productService.insertProduct(product);
   }

   @GetMapping("/get/{id}")
    public Product findProduct(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAll")
    public List<Product> findAllProduct(){
        return productService.getAllProduct();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
    @PutMapping("/update/{id}")
    public Product modifyProduct(@PathVariable int id , @RequestBody Product product){
        return productService.updateProduct(id,product);
    }

}
