package org.example.salesmanagementspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "sale_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleDetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double unitPrice;

    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    private SaleModel sale;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductModel product;
}
