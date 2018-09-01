package com.geonyeong.insurance.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="kind")
@Getter
@Setter
public class KindEntity{
    @Id
    private @Column(name = "id") Long id;

    private @Column(name = "name") String name;

    public KindEntity() {
    }
    public KindEntity(Long id) {
        this.id = id;
    }
    public KindEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(mappedBy = "kindEntity")
    @JsonBackReference
    private List<KindCompanyEntity> kindCompanyEntities;
}
