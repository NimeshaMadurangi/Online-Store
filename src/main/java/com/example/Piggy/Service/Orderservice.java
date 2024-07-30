package com.example.Piggy.Service;

import com.example.Piggy.Controller.DTO.Request.OrderRequestDTO;
import com.example.Piggy.Model.Order;

public interface Orderservice {
    Order addOrder(Long id, OrderRequestDTO orderRequestDTO);
}
