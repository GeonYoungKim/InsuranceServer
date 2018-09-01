package com.geonyeong.insurance.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="company")
@Getter
@Setter
public class CompanyEntity {
    @Id
    private @Column(name = "id") Long id;

    private @Column(name = "name") String name;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(mappedBy = "companyEntity")
    @JsonBackReference
    private List<KindCompanyEntity> kindCompanyEntities;
}
