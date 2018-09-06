package com.geonyeong.insurance.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class UserRolePK(
        @Column(insertable = false, updatable = false)
        @field:JsonProperty("userid")
        var userid : Int,
        @Column(insertable = false, updatable = false)
        @field:JsonProperty("roleid")
        var roleid : Int
):Serializable