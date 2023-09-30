package com.estudosdanilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosdanilo.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
