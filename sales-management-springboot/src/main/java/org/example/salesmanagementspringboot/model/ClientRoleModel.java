package org.example.salesmanagementspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "client_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonIgnore
    private ClientModel client;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private RoleModel role;
}
