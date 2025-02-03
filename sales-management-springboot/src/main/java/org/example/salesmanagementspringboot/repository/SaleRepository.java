package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.SaleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleModel, Long> {
}
