package com.example.nurb.ProjectTodoManagement.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tasks")

public class Task extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="description",length = 500)
    private String description;
    @Column(name="details",length = 500)
    private String details;
    @Column(name = "date")
    private Date date;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @JoinColumn(name="assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
    @JoinColumn(name="project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;
    //user tablosundaki bilgiler kayıt getirilsin mi? Lazy=> ihtiyaç duyulduğunda
    //Eager Herzaman

}
