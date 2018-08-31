package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Guide(
        @field:JsonProperty("kindCompanyId")
        var kindCompanyId: Long? = null,
        @field:JsonProperty("guideNo")
        var guideNo: Long? = null,
        @field:JsonProperty("guideTitle")
        var guideTitle: String? = null,
        @field:JsonProperty("guideContents")
        var guideContents: List<GuideContent>? = null,
        @field:JsonProperty("guideFiles")
        var guideFiles: List<GuideFile>? = null
)