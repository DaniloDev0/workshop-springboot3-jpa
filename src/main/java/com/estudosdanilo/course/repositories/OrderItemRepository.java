package com.estudosdanilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosdanilo.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
