package org.example.salesmanagementspringboot.controller;

import org.example.salesmanagementspringboot.model.SaleModel;
import org.example.salesmanagementspringboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("sale/{id}")
    public ResponseEntity<SaleModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(saleService.findById(id));
    }


}
