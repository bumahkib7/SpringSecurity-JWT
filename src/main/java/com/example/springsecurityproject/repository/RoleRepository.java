package com.example.springsecurityproject.repository;

import com.example.springsecurityproject.models.ERole;
import com.example.springsecurityproject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);

}