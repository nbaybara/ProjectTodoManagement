package com.example.nurb.ProjectTodoManagement.service;

import com.example.nurb.ProjectTodoManagement.dto.ProjectDto;
import com.example.nurb.ProjectTodoManagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<Project> getByProjectCodeAContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Long id);

    ProjectDto update(Long id, ProjectDto project);

}
