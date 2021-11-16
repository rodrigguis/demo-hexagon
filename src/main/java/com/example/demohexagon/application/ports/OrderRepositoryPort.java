package com.example.demohexagon.application.ports;

import com.example.demohexagon.adapters.outbound.entities.OrderEntity;
import com.example.demohexagon.application.domain.Order;

import java.util.List;

public interface OrderRepositoryPort {

  OrderEntity save(Order order);

  List<Order> findAll();

}
