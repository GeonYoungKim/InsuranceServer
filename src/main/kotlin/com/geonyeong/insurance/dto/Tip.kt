package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Tip(
        @field:JsonProperty("guideId")
        var guideId:Long,
        @field:JsonProperty("no")
        var no:Long,
        @field:JsonProperty("content")
        var content:String
)