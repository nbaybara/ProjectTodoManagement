package com.example.nurb.ProjectTodoManagement.dto;

import com.example.nurb.ProjectTodoManagement.entity.TaskStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "Issue History Data Transfer Object")
public class TaskHistoryDto {
    @ApiModelProperty(required = true,value = "ID")
    private Long id;
    @ApiModelProperty(required = true,value = "Issue")
    private TaskDto task;
    @ApiModelProperty(required = true,value = "Descriptnon")
    private String description;
    @ApiModelProperty(required = true,value = "Date")
    private Date date;
    @ApiModelProperty(required = true,value = "Issue Status")
    private TaskStatus taskStatus;
    @ApiModelProperty(required = true,value = "Details")
    private String details;
    @ApiModelProperty(required = true,value = "Assignee")
    private UserDto assignee;
}
