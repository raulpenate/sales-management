package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.ProductModel;
import org.example.salesmanagementspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<ProductModel> findAll(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
    }

    public ProductModel findById(Long id){
        Optional<ProductModel> product = productRepository.findById(id);
        return product.orElse(null);
    }

}
