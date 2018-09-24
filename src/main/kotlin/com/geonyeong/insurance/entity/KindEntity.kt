package com.geonyeong.insurance.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "kind")
data class KindEntity(
        @Id
        @Column(name = "id")
        var id: Long,
        @Column(name = "name")
        var name: String
) {
    @OneToMany(mappedBy = "kindEntity")
    @JsonBackReference
    val kindCompanyEntities: List<KindCompanyEntity> = ArrayList()

    constructor():this(0,"")
}