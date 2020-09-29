package com.example.nurb.ProjectTodoManagement.repository;

import com.example.nurb.ProjectTodoManagement.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
    //JPA tablo kayıtları, sort ... kriterlere göre veri getirme vs... update delete(CRUD)

}
