package com.example.Piggy.Controller;

import com.example.Piggy.Controller.DTO.Request.OrderRequestDTO;
import com.example.Piggy.Service.Orderservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderController {

    private Orderservice orderservice;

    @PostMapping("/users/{id}/orders")
    public void addOrder(@PathVariable Long id, @RequestBody OrderRequestDTO  orderRequestDTO) {
        orderservice.addOrder(id,orderRequestDTO);
    }
}
