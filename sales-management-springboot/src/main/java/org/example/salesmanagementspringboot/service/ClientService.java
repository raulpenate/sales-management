package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.ClientModel;
import org.example.salesmanagementspringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientModel create(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public Page<ClientModel> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return clientRepository.findAll(pageable);
    }

    public ClientModel findById(Long id) {
        Optional<ClientModel> client = clientRepository.findById(id);
        return client.orElse(null);
    }

    public ClientModel update(Long id, ClientModel clientModel) {
        Optional<ClientModel> client = clientRepository.findById(id);
        if (client.isPresent()) {
            ClientModel existingClient = client.get();
            existingClient.setName(clientModel.getName());
            existingClient.setEmail(clientModel.getEmail());
            return clientModel;
        }
        return null;
    }

    public boolean delete(Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
