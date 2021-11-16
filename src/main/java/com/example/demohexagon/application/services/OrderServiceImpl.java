package com.example.demohexagon.application.services;

import com.example.demohexagon.application.domain.Order;
import com.example.demohexagon.application.ports.OrderRepositoryPort;
import com.example.demohexagon.application.ports.OrderServicePort;

import java.util.List;

public class OrderServiceImpl implements OrderServicePort {

  private OrderRepositoryPort orderRepositoryPort;

  public OrderServiceImpl(OrderRepositoryPort orderRepositoryPort) {
    this.orderRepositoryPort = orderRepositoryPort;
  }

  @Override
  public Order createOrder(Order order) {
    final var orderEntity = orderRepositoryPort.save(order);
    return orderEntity.toOrder();
  }

  @Override
  public List<Order> getOrders() {
    return orderRepositoryPort.findAll();
  }
}
