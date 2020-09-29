package com.example.nurb.ProjectTodoManagement.dto;

import com.example.nurb.ProjectTodoManagement.entity.Project;
import com.example.nurb.ProjectTodoManagement.entity.TaskStatus;
import com.example.nurb.ProjectTodoManagement.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private TaskStatus taskStatus;
    private UserDto assignee;
    private ProjectDto project;

}
