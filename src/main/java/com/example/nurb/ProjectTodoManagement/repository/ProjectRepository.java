package com.example.nurb.ProjectTodoManagement.repository;
import com.example.nurb.ProjectTodoManagement.entity.Project;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project,Long> {
    //JPA tablo kayıtları, sort ... kriterlere göre veri getirme vs... update delete(CRUD)
    List<Project> getByProjectCode(String projectCode);
    List<Project> getByProjectCodeAContains(String projectCode);
    List<Project> findBy(Pageable pageable);
    List<Project> findBy(Sort sort);



}
