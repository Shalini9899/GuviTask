package com.spring.product.Service.ServiceIMPL;

import com.spring.product.Entity.Product;
import com.spring.product.Repository.ProductRepository;
import com.spring.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducrServiceIMPL implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    @Override
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }
}