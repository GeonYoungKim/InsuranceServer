package com.geonyeong.insurance.entity

import com.geonyeong.insurance.dto.TipIdDto
import javax.persistence.*

@Entity
@Table(name = "tip")
@IdClass(TipIdDto::class)
data class TipEntity(
        @Id
        @Column(name = "guide_id")
        var guideId: Long,
        @Id
        @Column(name = "no")
        var no: Long,
        @Column
        var content: String
){
        constructor():this(0,0,"")
}

