package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.ClientRoleModel;
import org.example.salesmanagementspringboot.repository.ClientRepository;
import org.example.salesmanagementspringboot.repository.ClientRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientRoleService {

    @Autowired
    private ClientRoleRepository clientRoleRepository;

    public List<ClientRoleModel> findByClientId(Long clientId){
        return clientRoleRepository.findAll().stream()
                .filter(clientRole -> clientRole.getClient().getId().equals(clientId))
                .toList();
    }
}
