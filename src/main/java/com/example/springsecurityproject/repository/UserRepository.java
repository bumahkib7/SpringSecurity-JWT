package com.example.springsecurityproject.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
	Optional<Object> findByUsername(String username);


	void save(Object user);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

}
