package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class GuideFile(
        @field:JsonProperty("guideId")
        var guideId:Long?=null,
        @field:JsonProperty("guideNo")
        var guideNo:Long?=null,
        @field:JsonProperty("no")
        var no:Long?=null,
        @field:JsonProperty("route")
        var route:String?=null,
        @field:JsonProperty("preview")
        var preview:String?=null,
        @field:JsonProperty("title")
        var title:String?=null
)