package com.example.nurb.ProjectTodoManagement.dto;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {
    @ApiModelProperty(value = "ID Of Project")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true,value = "Code Of Project")
    private String projectCode;
    @NotNull
    @ApiModelProperty(required = true,value = "Name Of Project")
    private String projectName;
}
