package com.geonyeong.insurance.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "company")
data class CompanyEntity(
        @Id
        @Column(name = "id")
        var id: Long,
        @Column
        var name:String
){
    @OneToMany(mappedBy = "companyEntity")
    @JsonBackReference
    val kindCompanyEntities: List<KindCompanyEntity> = ArrayList()

    constructor():this(0,"")
}