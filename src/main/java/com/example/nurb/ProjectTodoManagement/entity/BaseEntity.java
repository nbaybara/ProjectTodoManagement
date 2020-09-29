package com.example.nurb.ProjectTodoManagement.entity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@Getter @Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    //Bu classtakı metodları override etmek isteyebiliriz o yüzden abstract yapıyoruz.
    //Serializabla=Bu nesneye yetenekler kazandırır, datann diske yazılabilmesi vs
    //Her tabloda olmasını istediğim tablolar
    //Data annotation get set metodlarını otomatik olarak getiriyor. :)
    // Bu fieldlerin özelliklerini detaylandırmak için Column kullanıyoruz.
    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="created_by",length = 100)
    private String createdBy;
    @Column(name="updated_at")
    private Date updatedAt;
    @Column(name="updated_by",length = 100)
    private Date updatedBy;
    @Column(name="status")
    private Boolean status;

}
