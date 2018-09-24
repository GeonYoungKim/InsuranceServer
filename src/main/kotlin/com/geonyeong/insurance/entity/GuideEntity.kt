package com.geonyeong.insurance.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "guide")
data class GuideEntity(
        @Id
        @Column(name = "no")
        var no: Long?,
        @Column(name = "title")
        var title:String?,
        @ManyToOne(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name = "kind_company_id")
        @JsonBackReference
        var kindCompanyEntity: KindCompanyEntity?
){
        constructor():this(0,"",null)
}