package com.example.nurb.ProjectTodoManagement.service;

import com.example.nurb.ProjectTodoManagement.dto.TaskDto;
import com.example.nurb.ProjectTodoManagement.entity.Task;
import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import com.example.nurb.ProjectTodoManagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;


public interface TaskService {

    TaskDto save(TaskDto task);

    TaskDto getById(Long id);

    TPage<TaskDto> getAllPageable(Pageable pageable);

    Boolean delete(Long task);
    TaskDto update(Long id , @Valid TaskDto project);

}
