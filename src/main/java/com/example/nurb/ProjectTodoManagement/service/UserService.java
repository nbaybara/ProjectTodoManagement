package com.example.nurb.ProjectTodoManagement.service;

import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import com.example.nurb.ProjectTodoManagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUsername(String username);

}
