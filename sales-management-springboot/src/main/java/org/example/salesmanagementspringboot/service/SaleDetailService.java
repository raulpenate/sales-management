package org.example.salesmanagementspringboot.service;

import org.example.salesmanagementspringboot.model.SaleDetailModel;
import org.example.salesmanagementspringboot.repository.SaleDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleDetailService {

    @Autowired
    private SaleDetailRepository saleDetailRepository;

    public SaleDetailModel findById(Long id) {
        Optional<SaleDetailModel> saleDetail = saleDetailRepository.findById(id);
        return saleDetail.orElse(null);
    }

    public List<SaleDetailModel> create(List<SaleDetailModel> saleDetailModel) {
        return saleDetailRepository.saveAll(saleDetailModel);
    }

}
