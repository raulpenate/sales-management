package org.example.salesmanagementspringboot.controller;

import org.example.salesmanagementspringboot.model.SaleDetailModel;
import org.example.salesmanagementspringboot.model.SaleModel;
import org.example.salesmanagementspringboot.service.SaleDetailService;
import org.example.salesmanagementspringboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;
    @Autowired
    private SaleDetailService saleDetailService;

    @GetMapping("sale/{id}")
    public ResponseEntity<SaleModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(saleService.findById(id));
    }

    @PostMapping("sale")
    public ResponseEntity<SaleModel> createSale(@RequestBody SaleModel sale) {
        return ResponseEntity.ok(saleService.saveSaleWithDetails(sale));
    }

}
