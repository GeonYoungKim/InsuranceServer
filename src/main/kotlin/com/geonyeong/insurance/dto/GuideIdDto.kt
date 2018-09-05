package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

data class GuideIdDto(
        @field:JsonProperty("guideId")
        var guideId: Long?=null,
        @field:JsonProperty("guideNo")
        var guideNo: Long?=null,
        @field:JsonProperty("no")
        var no: Long?=null
):Serializable