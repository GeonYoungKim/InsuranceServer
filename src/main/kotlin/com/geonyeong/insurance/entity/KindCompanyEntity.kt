package com.geonyeong.insurance.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "kind_company")
data class KindCompanyEntity(
        @Id
        @Column(name = "id")
        var id: Long,

        @ManyToOne(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name = "kind_id")
        var kindEntity: KindEntity?,

        @ManyToOne(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name = "company_id")
        var companyEntity: CompanyEntity?,

        @OneToMany(mappedBy = "kindCompanyEntity",cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference
        var guideEntities: List<GuideEntity>?
){
        constructor():this(0,null,null,null)
}