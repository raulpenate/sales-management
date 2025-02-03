package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.ClientRoleModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRoleRepository extends JpaRepository<ClientRoleModel, Long> {
}
