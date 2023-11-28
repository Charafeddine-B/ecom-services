package org.sid.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.model.Product;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // @Id @GeneratedV
    private Long id;
    private Long ProductId;
    @Transient
    private Product product;
    private double price;
    private int quantity;
    private  double discount;
    @ManyToOne
    private Order order;

}