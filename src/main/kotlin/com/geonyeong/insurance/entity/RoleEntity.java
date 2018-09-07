package com.geonyeong.insurance.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "role")
@Setter
@Getter
@NoArgsConstructor
public class RoleEntity {
    @Id
    @GeneratedValue
    private int role_id;
    private String role;
}
