package com.estudosdanilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosdanilo.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
