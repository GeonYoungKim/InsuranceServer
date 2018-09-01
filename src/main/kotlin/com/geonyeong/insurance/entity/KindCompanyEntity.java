package com.geonyeong.insurance.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kind_company")
@Getter
@Setter
public class KindCompanyEntity {

    @Id
    private @Column(name = "id") Long id;

    public KindCompanyEntity() {
    }

    public KindCompanyEntity(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kind_id")
    private KindEntity kindEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private CompanyEntity companyEntity;

    @OneToMany(mappedBy = "kindCompanyEntity",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<GuideEntity> guideEntities;

}
