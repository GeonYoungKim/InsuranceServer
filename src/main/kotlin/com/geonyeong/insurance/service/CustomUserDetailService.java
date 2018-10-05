package com.geonyeong.insurance.service;

import com.geonyeong.insurance.entity.UserEntity;
import com.geonyeong.insurance.repository.UserRepository;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = repository.findByUsername(username);
        Gson gson = new Gson();
        System.out.println(gson.toJson(userEntity));
        CustomUserDetail userDetail = null;
        if(userEntity != null){
            userDetail = new CustomUserDetail();
            userDetail.setUserEntity(userEntity);
        }else{
            throw new UsernameNotFoundException("User not exist with name : "+username);
        }
        return userDetail;
    }
}
