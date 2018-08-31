package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class JoinGuide(
        @field:JsonProperty("guideId")
        var guideId: Long,
        @field:JsonProperty("guideNo")
        var guideNo: Long,
        @field:JsonProperty("guideTitle")
        var guideTitle: String,
        @field:JsonProperty("guideContentNo")
        var guideContentNo: Long,
        @field:JsonProperty("guideContentContent")
        var guideContentContent: String,
        @field:JsonProperty("guideFileNo")
        var guideFileNo: Long,
        @field:JsonProperty("guideFileRoute")
        var guideFileRoute: String,
        @field:JsonProperty("guideFilePreview")
        var guideFilePreview: String,
        @field:JsonProperty("guideFileTitle")
        var guideFileTitle: String
)