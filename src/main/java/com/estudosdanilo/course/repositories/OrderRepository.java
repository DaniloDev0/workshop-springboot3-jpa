package com.estudosdanilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosdanilo.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
