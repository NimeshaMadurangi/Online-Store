package com.example.Piggy.Controller.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {

    private String itemCode;

    private Integer quantity;

    private Integer unitPrice;

    private Integer total;

}
