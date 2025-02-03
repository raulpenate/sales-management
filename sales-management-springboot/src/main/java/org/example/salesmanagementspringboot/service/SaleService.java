package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.SaleDetailModel;
import org.example.salesmanagementspringboot.model.SaleModel;
import org.example.salesmanagementspringboot.repository.SaleDetailRepository;
import org.example.salesmanagementspringboot.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SaleDetailRepository saleDetailRepository;

    public SaleModel findById(Long id) {
        Optional<SaleModel> sale = saleRepository.findById(id);
        return sale.orElse(null);
    }

    public SaleModel saveSaleWithDetails(SaleModel sale) {
        // Save the Sale first
        SaleModel savedSale = saleRepository.save(sale);

        // Assign the saved sale to each saleDetail
        for (SaleDetailModel detail : sale.getSaleDetails()) {
            detail.setSale(savedSale); // Set the sale reference
        }

        // Save all saleDetails associated with this sale
        saleDetailRepository.saveAll(sale.getSaleDetails());

        return savedSale;
    }

}
