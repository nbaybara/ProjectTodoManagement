package com.example.nurb.ProjectTodoManagement.dto;

import com.example.nurb.ProjectTodoManagement.entity.Project;
import com.example.nurb.ProjectTodoManagement.entity.TaskStatus;
import com.example.nurb.ProjectTodoManagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private TaskStatus taskStatus;
    private UserDto assignee;
    private ProjectDto project;

}
