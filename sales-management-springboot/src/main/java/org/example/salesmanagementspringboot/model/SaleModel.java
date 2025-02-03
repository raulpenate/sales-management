package org.example.salesmanagementspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private double total;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private ClientModel client;

    @OneToMany(mappedBy = "sale")
    private List<SaleDetailModel> salesDetails;
}
