package com.geonyeong.insurance.dto

import lombok.Builder
import java.io.Serializable


class UserDto(
        var username: String?,
        var password: String?,
        var email: String?
)