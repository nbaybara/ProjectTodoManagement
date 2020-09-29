package com.example.nurb.ProjectTodoManagement.service.implementation;

import com.example.nurb.ProjectTodoManagement.entity.Project;
import com.example.nurb.ProjectTodoManagement.repository.ProjectRepository;
import com.example.nurb.ProjectTodoManagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        if (project.getProjectCode() == null) {
            throw new IllegalArgumentException("Task cannot be null!");
        }
        project = projectRepository.save(project);
        return project;

    }

    @Override
    public Project getById(Long id) {
        return projectRepository.getOne(id);
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeAContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
