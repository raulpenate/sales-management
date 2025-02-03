package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.ClientModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
