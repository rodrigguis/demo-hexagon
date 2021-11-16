package com.example.demohexagon.application.ports;

import com.example.demohexagon.application.domain.Order;

import java.util.List;

public interface OrderServicePort {

  Order createOrder(Order order);

  List<Order> getOrders();
}
