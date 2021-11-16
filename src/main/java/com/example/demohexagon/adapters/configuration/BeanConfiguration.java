package com.example.demohexagon.adapters.configuration;

import com.example.demohexagon.application.ports.OrderRepositoryPort;
import com.example.demohexagon.application.ports.OrderServicePort;
import com.example.demohexagon.application.services.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  OrderServicePort orderService(OrderRepositoryPort orderRepositoryPort) {
    return new OrderServiceImpl(orderRepositoryPort);
  }
  
}
