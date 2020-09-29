package com.example.nurb.ProjectTodoManagement.service;

import com.example.nurb.ProjectTodoManagement.entity.Task;
import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TaskHistoryService {

    TaskHistory save(TaskHistory taskHistory);

    TaskHistory getById(Long id);

    Page<TaskHistory> getAllPageable(Pageable pageable);
    Boolean delete(TaskHistory taskHistory);

}
