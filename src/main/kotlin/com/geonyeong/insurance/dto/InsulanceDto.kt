package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.geonyeong.insurance.entity.TipEntity

data class InsulanceDto(
        @field:JsonProperty("guide")
        var guides : List<GuideDto>,
        @field:JsonProperty("tips")
        var tips : List<TipEntity>
)