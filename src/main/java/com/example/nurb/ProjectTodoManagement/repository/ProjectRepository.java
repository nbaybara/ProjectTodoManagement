package com.example.nurb.ProjectTodoManagement.repository;
import com.example.nurb.ProjectTodoManagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project,Long> {
    //JPA tablo kayıtları, sort ... kriterlere göre veri getirme vs... update delete(CRUD)
    Project getByProjectCode(String projectCode);
    List<Project> getByProjectCodeContains(String projectCode);
    Page<Project> findAll(Pageable pageable);
    List<Project> findAll(Sort sort);


    Project getByProjectCodeAndIdNot(String projectCode, Long id);
}
