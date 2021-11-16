package com.example.demohexagon.adapters.inbound.resource;

import com.example.demohexagon.application.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

  private UUID code;
  private String sku;
  private String name;
  private Double price;
  private int quantity;

  public static OrderDTO toOrderDTO(Order order) {
    return OrderDTO.builder()
        .code(order.getCode())
        .name(order.getName())
        .quantity(order.getQuantity())
        .sku(order.getSku())
        .price(order.getPrice())
        .build();
  }

  public static Order toOrder(OrderDTO orderDTO) {
    return Order.builder()
        .name(orderDTO.getName())
        .sku(orderDTO.getSku())
        .price(orderDTO.getPrice())
        .quantity(orderDTO.getQuantity())
        .build();
  }

}
