package org.example.salesmanagementspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sale_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double unitPrice;

    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    @JsonIgnore
    private SaleModel sale;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductModel product;
}
