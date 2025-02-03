package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.ProductModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
