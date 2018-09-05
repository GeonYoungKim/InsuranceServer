package com.geonyeong.insurance.repository;


import com.geonyeong.insurance.dto.GuideDto;
import com.geonyeong.insurance.entity.GuideEntity;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuideRepository extends CrudRepository<GuideEntity,Long> {
    List<GuideEntity> findByKindCompanyEntity(KindCompanyEntity kindCompanyEntity);

}
