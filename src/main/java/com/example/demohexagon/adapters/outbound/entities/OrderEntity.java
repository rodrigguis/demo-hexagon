package com.example.demohexagon.adapters.outbound.entities;

import com.example.demohexagon.application.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produtos")
public class OrderEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID code;
  private String sku;
  private String name;
  private Double price;
  private int quantity;

  public Order toOrder() {
    return new Order(this.code, this.sku, this.name, this.price, this.quantity);
  }
}
