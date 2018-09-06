package com.geonyeong.insurance.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
@Setter
@Getter
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private @Column(name = "name") String name;

    @OneToMany(mappedBy = "roleEntity")
    private List<UserRoleEntity> userRoleEntities;

    public RoleEntity() {
    }

    public UserRoleEntity addUserRoleEntity(UserRoleEntity userRoleEntity){
        getUserRoleEntities().add(userRoleEntity);
        userRoleEntity.setRoleEntity(this);
        return userRoleEntity;
    }
    public UserRoleEntity removeUserRoleEntity(UserRoleEntity userRoleEntity){
        getUserRoleEntities().remove(userRoleEntity);
        userRoleEntity.setRoleEntity(null);
        return userRoleEntity;
    }
}
