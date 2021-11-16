package com.example.demohexagon.adapters.inbound.resource;

import com.example.demohexagon.application.domain.Order;
import com.example.demohexagon.application.ports.OrderServicePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("orders")
public class OrderResource {

  private OrderServicePort orderService;

  public OrderResource(OrderServicePort orderService) {
    this.orderService = orderService;
  }

  @GetMapping
  public List<OrderDTO> getAllOrders() {
    return orderService.getOrders().stream()
        .map(OrderDTO::toOrderDTO)
        .collect(Collectors.toList());
  }

  @PostMapping
  public Order createOrder(@RequestBody OrderDTO orderDTO) {
    var order = OrderDTO.toOrder(orderDTO);
    return orderService.createOrder(order);
  }

}
