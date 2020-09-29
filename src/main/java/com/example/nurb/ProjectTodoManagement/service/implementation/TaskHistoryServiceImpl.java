package com.example.nurb.ProjectTodoManagement.service.implementation;

import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import com.example.nurb.ProjectTodoManagement.repository.TaskHistoryRepository;
import com.example.nurb.ProjectTodoManagement.service.TaskHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskHistoryServiceImpl implements TaskHistoryService {
    private final TaskHistoryRepository taskHistoryRepository;

    public TaskHistoryServiceImpl(TaskHistoryRepository taskHistoryRepository) {
        this.taskHistoryRepository = taskHistoryRepository;
    }

    @Override
    public TaskHistory save(TaskHistory taskHistory) {
        if (taskHistory.getDate() == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        taskHistory = taskHistoryRepository.save(taskHistory);
        return taskHistory;
    }

    @Override
    public TaskHistory getById(Long id) {
        return taskHistoryRepository.getOne(id);
    }

    @Override
    public Page<TaskHistory> getAllPageable(Pageable pageable) {
        return taskHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(TaskHistory taskHistory) {
        taskHistoryRepository.delete(taskHistory);
        return Boolean.TRUE;
    }
}
