package com.example.nurb.ProjectTodoManagement.api;

import com.example.nurb.ProjectTodoManagement.dto.ProjectDto;
import com.example.nurb.ProjectTodoManagement.service.implementation.ProjectServiceImpl;
import com.example.nurb.ProjectTodoManagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/versioning")
@Api(value = ApiPaths.ProjectCtrl.CTRL, tags = "Project APIs")
@CrossOrigin
public class ProjectVersionedApi {
    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @GetMapping(value = "/{id}",params = "version=1")
    @ApiOperation(value = "Get By Id Operation V1", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV1(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @GetMapping(value = "/{id}", params = "version=2")
    @ApiOperation(value = "Get By Id Operation V2", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV2(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }
}
