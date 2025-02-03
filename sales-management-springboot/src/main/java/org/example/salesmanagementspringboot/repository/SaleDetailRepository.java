package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.SaleDetailModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDetailRepository extends JpaRepository<SaleDetailModel, Long> {
}