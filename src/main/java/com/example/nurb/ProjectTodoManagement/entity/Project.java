package com.example.nurb.ProjectTodoManagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "projectCode", length = 1000, unique = true)
    private String projectCode;
    @Column(name = "projectName", length = 1000)
    private String projectName;
    @JoinColumn(name="manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  User manager;
}
