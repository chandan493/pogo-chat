package com.pogo.aaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogo.aaservice.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
