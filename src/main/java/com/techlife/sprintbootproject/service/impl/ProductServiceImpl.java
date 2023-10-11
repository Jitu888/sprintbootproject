package com.techlife.sprintbootproject.service.impl;

import com.techlife.sprintbootproject.model.Product;
import com.techlife.sprintbootproject.repo.ProductRepo;
import com.techlife.sprintbootproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired ProductRepo productRepo;
    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {

        Product getProductFromDb = productRepo.findById(id).get();
        getProductFromDb.setRegionName(product.getRegionName());
        getProductFromDb.setRegionStatus(product.getRegionStatus());
        getProductFromDb.setAvailableInRegion(product.getAvailableInRegion());
        return productRepo.save(getProductFromDb);
    }

    @Override
    public void deleteProduct(int id) {
     productRepo.deleteById(id);

    }
}
