package com.example.Piggy.Controller.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {
    private String username;

    private String itemCode;

    private Integer quantity;

    private Integer unitPrice;

    private Integer total;
}
