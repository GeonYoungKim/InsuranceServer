package com.geonyeong.insurance.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private @Column(name = "enabled") int enabled;
    private @Column(name = "password") String password;
    private @Column(name = "username") String username;

    @OneToMany(mappedBy = "userEntity")
    private List<UserRoleEntity> userRoleEntities;

    public UserEntity() {
    }


}
