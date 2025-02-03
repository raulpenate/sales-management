package org.example.salesmanagementspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.salesmanagementspringboot.model.ClientModel;
import org.example.salesmanagementspringboot.model.ClientRoleModel;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientWithRolesDTO {
    private ClientModel client;
    private List<ClientRoleModel> roles;
}
