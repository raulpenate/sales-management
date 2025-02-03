package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.dto.ClientWithRolesDTO;
import org.example.salesmanagementspringboot.model.ClientModel;
import org.example.salesmanagementspringboot.model.ClientRoleModel;
import org.example.salesmanagementspringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientRoleService clientRoleService;

    public ClientModel findById(Long id) {
        Optional<ClientModel> client = clientRepository.findById(id);
        return client.orElse(null);
    }

    public List<ClientRoleModel> getClientRoles(Long clientId){
        return clientRoleService.findByClientId(clientId);
    }

    public ClientWithRolesDTO getClientWithRoles(Long clientId){
        ClientModel client = findById(clientId);
        List<ClientRoleModel> roles = getClientRoles(clientId);
        return new ClientWithRolesDTO(client, roles);
    }
}
