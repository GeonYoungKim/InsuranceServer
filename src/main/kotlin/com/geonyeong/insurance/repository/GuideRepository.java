package com.geonyeong.insurance.repository;


import com.geonyeong.insurance.entity.GuideEntity;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuideRepository extends JpaRepository<GuideEntity,Long> {
    List<GuideEntity> findByKindCompanyEntity(KindCompanyEntity kindCompanyEntity);

}
