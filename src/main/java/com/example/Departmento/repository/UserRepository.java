package com.example.Departmento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Departmento.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
