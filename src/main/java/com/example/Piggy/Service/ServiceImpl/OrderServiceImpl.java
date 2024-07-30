package com.example.Piggy.Service.ServiceImpl;

import com.example.Piggy.Controller.DTO.Request.OrderRequestDTO;
import com.example.Piggy.Model.Order;
import com.example.Piggy.Model.User;
import com.example.Piggy.Repository.OrderRepository;
import com.example.Piggy.Repository.UserRepository;
import com.example.Piggy.Service.Orderservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements Orderservice {

    private OrderRepository orderRepository;
    private UserRepository userRepository;

    @Override
    public Order addOrder(Long id, OrderRequestDTO orderRequestDTO) {
        Optional<User>userOptional = userRepository.findById(id);

        if(userOptional.isPresent()) {
            User user = userOptional.get();
            Order order = new Order();

            order.setItemCode(orderRequestDTO.getItemCode());
            order.setQuantity(orderRequestDTO.getQuantity());
            order.setUnitPrice(orderRequestDTO.getUnitPrice());
            order.setTotal(orderRequestDTO.getTotal());
            order.setUser(user);
            orderRepository.save(order);
        }
        return null;
    }




}
