package com.hackathon.hackbe.repository;

import com.hackathon.hackbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByEmailEquals(String email);
}
