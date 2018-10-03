package com.geonyeong.insurance.repository;


import com.geonyeong.insurance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    UserEntity findByUsername(String username);
}
