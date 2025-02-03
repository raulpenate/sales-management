package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.ClientModel;
import org.example.salesmanagementspringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Page<ClientModel> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return clientRepository.findAll(pageable);
    }

}
