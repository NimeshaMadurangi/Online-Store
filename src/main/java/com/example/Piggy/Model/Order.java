package com.example.Piggy.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String itemCode;

    private Integer quantity;

    private Integer unitPrice;

    private Integer total;



    @ManyToOne
    private User user;





}
