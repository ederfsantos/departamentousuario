package com.ederjavaman.departamentousuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederjavaman.departamentousuario.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
