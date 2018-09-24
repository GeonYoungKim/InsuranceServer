package com.geonyeong.insurance.entity

import com.geonyeong.insurance.dto.GuideIdDto
import javax.persistence.*

@Entity
@Table(name = "guide_content")
@IdClass(GuideIdDto::class)
data class GuideContentEntity(
        @Id
        @Column(name = "guide_id")
        var guideId:Long,
        @Id
        @Column(name = "guide_no")
        var guideNo:Long,
        @Id
        @Column(name = "no")
        var no:Long,
        @Column(name = "content")
        var content:String
){
        constructor():this(0,0,0,"")
}