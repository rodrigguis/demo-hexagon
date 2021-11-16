package com.example.demohexagon.adapters.outbound.persistence;

import com.example.demohexagon.adapters.outbound.entities.OrderEntity;
import com.example.demohexagon.application.domain.Order;
import com.example.demohexagon.application.ports.OrderRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class H2OrderRepository implements OrderRepositoryPort {

  private final SpringDataOrderRepository orderRepository;

  public H2OrderRepository(SpringDataOrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public OrderEntity save(Order order) {
    final var orderEntity = OrderEntity.builder()
        .code(order.getCode())
        .sku(order.getSku())
        .name(order.getName())
        .price(order.getPrice())
        .quantity(order.getQuantity())
        .build();

    return orderRepository.save(orderEntity);
  }

  @Override
  public List<Order> findAll() {
    final var ordersEntities = orderRepository.findAll();
    return ordersEntities.stream()
        .map(OrderEntity::toOrder)
        .collect(Collectors.toList());
  }
}
