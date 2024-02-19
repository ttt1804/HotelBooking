package com.ttt.hotelbooking.repository;

import com.ttt.hotelbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    void deleteByEmail(String email);
    Optional<User> findByEmail(String email);
}
