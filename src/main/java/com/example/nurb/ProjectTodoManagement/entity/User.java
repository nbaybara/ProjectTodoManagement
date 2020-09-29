package com.example.nurb.ProjectTodoManagement.entity;

import lombok.*;
import org.springframework.scheduling.config.Task;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "uname", length = 100, unique = true)
    private String name;
    @Column(name = "pw", length = 200)
    private String password;
    @Column(name = "name_sname", length = 100)
    private String name_sname;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Task> tasks;
}
