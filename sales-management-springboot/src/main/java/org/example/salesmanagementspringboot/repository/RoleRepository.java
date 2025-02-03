package org.example.salesmanagementspringboot.repository;

import org.example.salesmanagementspringboot.model.RoleModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
}
