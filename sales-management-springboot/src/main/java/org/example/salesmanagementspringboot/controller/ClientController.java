package org.example.salesmanagementspringboot.controller;

import org.example.salesmanagementspringboot.model.ClientModel;
import org.example.salesmanagementspringboot.service.ClientService;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public Page<ClientModel> getClients(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        return clientService.findAll(page, size);
    }
}
