package com.geonyeong.insurance.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity {
    @Id
    private String username;
    private String password;
    private String email;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "username"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<RoleEntity> roles;
}
