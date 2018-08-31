package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class GuideContent(
        @field:JsonProperty("guideId")
        var guideId: Long,
        @field:JsonProperty("guideNo")
        var guideNo: Long,
        @field:JsonProperty("no")
        var no: Long,
        @field:JsonProperty("content")
        var content: String
)