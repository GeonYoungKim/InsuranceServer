package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class GuideContent(
        @field:JsonProperty("guideId")
        var guideId: Long?=null,
        @field:JsonProperty("guideNo")
        var guideNo: Long?=null,
        @field:JsonProperty("no")
        var no: Long?=null,
        @field:JsonProperty("content")
        var content: String?=null
)