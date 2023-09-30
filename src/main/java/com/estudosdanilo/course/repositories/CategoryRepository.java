package com.estudosdanilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosdanilo.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
