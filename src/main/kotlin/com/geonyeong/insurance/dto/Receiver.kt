package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Receiver(
        @field:JsonProperty("name")
        var name:String,
        @field:JsonProperty("email")
        var email:String,
        @field:JsonProperty("validation")
        var validation:Int
)
