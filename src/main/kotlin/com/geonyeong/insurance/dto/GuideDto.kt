package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.geonyeong.insurance.entity.GuideContentEntity
import com.geonyeong.insurance.entity.GuideFileEntity

data class GuideDto(
        @field:JsonProperty("no")
        var no: Long,
        @field:JsonProperty("title")
        var title: String,
        @field:JsonProperty("contents")
        var contents: List<GuideContentEntity>? = null,
        @field:JsonProperty("files")
        var files: List<GuideFileEntity>? = null
)