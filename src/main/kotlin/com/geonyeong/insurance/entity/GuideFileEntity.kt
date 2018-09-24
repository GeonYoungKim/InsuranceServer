package com.geonyeong.insurance.entity

import com.fasterxml.jackson.annotation.JsonProperty
import com.geonyeong.insurance.dto.GuideIdDto
import org.hibernate.annotations.ColumnDefault
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "guide_file")
@IdClass(GuideIdDto::class)
data class GuideFileEntity(
        @Id
        @Column(name = "guide_id")
        @field:JsonProperty("guideId")
        var guideId: Long?,
        @Id
        @Column(name = "guide_no")
        @field:JsonProperty("guideNo")
        var guideNo: Long?,
        @Id
        @Column(name = "no")
        @field:JsonProperty("no")
        var no: Long?,
        @Column(name = "route")
        @field:JsonProperty("route")
        var route: String?,
        @Column(name = "title")
        @field:JsonProperty("title")
        var title: String?,
        @ColumnDefault("NULL")
        @Column(name = "preview")
        @field:JsonProperty("preview")
        var preview: String?
):Serializable{
        constructor():this(0,0,0,"","","")
}