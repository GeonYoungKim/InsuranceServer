package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {


}
