package com.geonyeong.insurance.entity;

import com.geonyeong.insurance.dto.UserRolePK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_role")
@Setter
@Getter
public class UserRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserRolePK id;

    private @Column(name = "enabled") int enabled;

    @ManyToOne
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "roleid", insertable = false, updatable = false)
    private RoleEntity roleEntity;

    public UserRoleEntity() {
    }

}
