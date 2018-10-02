package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.ColumnDefault
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.IdClass

data class GuideFileDto(
        @field:JsonProperty("guideId")
        var guideId: Long?,
        @field:JsonProperty("guideNo")
        var guideNo: Long?,
        @field:JsonProperty("no")
        var no: Long?,
        @field:JsonProperty("route")
        var route: String?,
        @field:JsonProperty("title")
        var title: String?,
        @field:JsonProperty("preview")
        var preview: String?
): Serializable {
    constructor():this(0,0,0,"","","")
}