package com.techlife.sprintbootproject.service;

import com.techlife.sprintbootproject.model.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(int id);

    public List<Product> getAllProduct();

    public Product insertProduct(Product product);
    public Product updateProduct(int id,Product product);
    public void deleteProduct(int id);


}
