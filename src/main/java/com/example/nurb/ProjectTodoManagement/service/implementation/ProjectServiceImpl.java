package com.example.nurb.ProjectTodoManagement.service.implementation;
import com.example.nurb.ProjectTodoManagement.dto.ProjectDto;
import com.example.nurb.ProjectTodoManagement.entity.Project;
import com.example.nurb.ProjectTodoManagement.repository.ProjectRepository;
import com.example.nurb.ProjectTodoManagement.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository,
                              ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProjectDto save(ProjectDto project) {
        Project projectCheck = projectRepository.getByProjectCode(project.getProjectCode());
        if (projectCheck != null) {
            throw new IllegalArgumentException("Project Code Already exist");
        }
        Project p = modelMapper.map(project, Project.class);
        p=projectRepository.save(p);
        project.setId(p.getId());
        return project;

    }

    @Override
    public ProjectDto getById(Long id) {
        log.info("ccc " + id);
        Project p = projectRepository.getOne(id);
        return modelMapper.map(p, ProjectDto.class);

    }

    @Override
    public ProjectDto getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }

    public Boolean delete(Long id) {
        projectRepository.deleteById(id);
        return true;
    }
    @Override
    public Boolean delete(ProjectDto project) {
        return null;
    }

    @Override
    public ProjectDto update(Long id, ProjectDto project) {
        Project projectDb = projectRepository.getOne(id);
        if (projectDb == null) {
            throw new IllegalArgumentException("Project doesnt exit. Id:" + id);
        }
        Project projectCheck = projectRepository.getByProjectCodeAndIdNot(project.getProjectCode(), id);
        if (projectCheck != null) {
            throw new IllegalArgumentException("Project Code Already exist");
        }
        projectDb.setProjectCode(project.getProjectCode());
        projectDb.setProjectName(project.getProjectName());
        projectRepository.save(projectDb);

        return modelMapper.map(projectDb, ProjectDto.class);
    }


}
