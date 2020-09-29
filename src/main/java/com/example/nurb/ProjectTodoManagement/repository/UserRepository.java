package com.example.nurb.ProjectTodoManagement.repository;

import com.example.nurb.ProjectTodoManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
