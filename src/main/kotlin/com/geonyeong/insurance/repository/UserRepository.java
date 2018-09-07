package com.geonyeong.insurance.repository;


import com.geonyeong.insurance.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,String> {
    UserEntity findByUsername(String username);
}
