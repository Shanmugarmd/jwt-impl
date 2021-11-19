package com.handson.demo.jwtauthdemo.repository;

import java.util.Optional;

import com.handson.demo.jwtauthdemo.models.ERole;
import com.handson.demo.jwtauthdemo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}