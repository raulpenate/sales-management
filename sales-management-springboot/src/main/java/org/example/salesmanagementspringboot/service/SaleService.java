package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.SaleDetailModel;
import org.example.salesmanagementspringboot.model.SaleModel;
import org.example.salesmanagementspringboot.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public SaleModel findById(Long id) {
        Optional<SaleModel> sale = saleRepository.findById(id);
        return sale.orElse(null);
    }

}
