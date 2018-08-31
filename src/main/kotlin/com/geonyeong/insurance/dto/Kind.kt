package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Kind(
        @field:JsonProperty("id")
        var id:Long,
        @field:JsonProperty("name")
        var name:String
)