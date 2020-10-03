package com.example.nurb.ProjectTodoManagement.api;
import com.example.nurb.ProjectTodoManagement.dto.TaskDto;
import com.example.nurb.ProjectTodoManagement.service.implementation.TaskServiceImpl;
import com.example.nurb.ProjectTodoManagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.TaskCtrl.CTRL)
@Api(value = ApiPaths.TaskCtrl.CTRL, tags = "Task APIs")
public class TaskController {
    //Http Metodları GET_Post Put Delete
    //Response Entity Api metodların ortak bir imzaya sahip olması ve
    //üzerlerinde status mesaj koyma build etme özelliklerini barındırır.

    private final TaskServiceImpl taskServiceImpl;

    public TaskController(TaskServiceImpl taskServiceImpl) {
        this.taskServiceImpl = taskServiceImpl;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get By Id Operation", response = TaskDto.class)
    public ResponseEntity<TaskDto> getById(@PathVariable("id") Long id) {
        TaskDto taskDto = taskServiceImpl.getById(id);
        return ResponseEntity.ok(taskDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Operation", response = TaskDto.class)
    public ResponseEntity<TaskDto> createProject(@Valid @RequestBody TaskDto task) {
        return ResponseEntity.ok(taskServiceImpl.save(task));
    }
    @PutMapping("/{id}")
    @ApiOperation(value = "Update Operation", response = TaskDto.class)
    public ResponseEntity<TaskDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody TaskDto project) {
        return ResponseEntity.ok(taskServiceImpl.update(id, project));
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Operation", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(taskServiceImpl.delete(id));
    }

}
