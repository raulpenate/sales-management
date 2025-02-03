package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.SaleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<SaleModel, Long> {
}
