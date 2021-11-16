package com.example.demohexagon.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private UUID code;
    private String sku;
    private String name;
    private Double price;
    private int quantity;

}


