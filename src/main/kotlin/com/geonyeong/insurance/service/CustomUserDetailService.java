package com.geonyeong.insurance.service;

import com.geonyeong.insurance.entity.UserEntity;
import com.geonyeong.insurance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = repository.findByUsername(username);

        CustomUserDetail userDetail;
        if(userEntity != null){
            userDetail = new CustomUserDetail();
            userDetail.setUserEntity(userEntity);
        }else{
            throw new UsernameNotFoundException("User not exist with name : "+username);
        }
        return null;
    }
}
