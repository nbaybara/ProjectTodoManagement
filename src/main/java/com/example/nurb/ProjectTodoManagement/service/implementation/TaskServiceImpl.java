package com.example.nurb.ProjectTodoManagement.service.implementation;
import com.example.nurb.ProjectTodoManagement.entity.Task;
import com.example.nurb.ProjectTodoManagement.repository.TaskRepository;
import com.example.nurb.ProjectTodoManagement.service.TaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;

    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getById(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    public Page<Task> getAllPageable(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Task task) {
        return null;
    }
}
