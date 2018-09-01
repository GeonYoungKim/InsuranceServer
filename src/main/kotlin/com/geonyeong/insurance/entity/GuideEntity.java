package com.geonyeong.insurance.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="guide")
@Getter
@Setter
public class GuideEntity {
    @Id
    private @Column(name = "no") Long no;

    private @Column(name = "title") String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kind_company_id")
    @JsonBackReference
    private KindCompanyEntity kindCompanyEntity;

}
