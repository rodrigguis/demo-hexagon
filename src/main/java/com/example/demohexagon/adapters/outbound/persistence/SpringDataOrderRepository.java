package com.example.demohexagon.adapters.outbound.persistence;

import com.example.demohexagon.adapters.outbound.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, UUID> {
}
