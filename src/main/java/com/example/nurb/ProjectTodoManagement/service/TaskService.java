package com.example.nurb.ProjectTodoManagement.service;

import com.example.nurb.ProjectTodoManagement.entity.Task;
import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TaskService {

    Task save(Task task);

    Task getById(Long id);

    Page<Task> getAllPageable(Pageable pageable);
    Boolean delete(Task task);

}
