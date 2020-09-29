package com.example.nurb.ProjectTodoManagement.service.implementation;

import com.example.nurb.ProjectTodoManagement.dto.TaskDto;
import com.example.nurb.ProjectTodoManagement.entity.Task;
import com.example.nurb.ProjectTodoManagement.repository.TaskRepository;
import com.example.nurb.ProjectTodoManagement.service.TaskService;
import com.example.nurb.ProjectTodoManagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    public TaskServiceImpl(TaskRepository taskRepository, ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TaskDto save(TaskDto task) {
        if (task.getDate() == null)
            throw new IllegalArgumentException("Task cannot be null");
        Task taskDb = modelMapper.map(task, Task.class); //Verileri eşleştirdi
        taskDb = taskRepository.save(taskDb); //Veritabanına kaydet
        return modelMapper.map(taskDb, TaskDto.class);

    }

    @Override
    public TaskDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<TaskDto> getAllPageable(Pageable pageable) {
        Page<Task> data = taskRepository.findAll(pageable);
        TPage page = new TPage<TaskDto>();
        TaskDto[] dtos = modelMapper.map(data.getContent(),TaskDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(TaskDto task) {
        return null;
    }
}
