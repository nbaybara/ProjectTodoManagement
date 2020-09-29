package com.example.nurb.ProjectTodoManagement.repository;

import com.example.nurb.ProjectTodoManagement.entity.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory,Long> {

    //JPA tablo kayıtları, sort ... kriterlere göre veri getirme vs... update delete(CRUD)
}
