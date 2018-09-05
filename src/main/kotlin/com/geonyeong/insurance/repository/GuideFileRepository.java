package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.GuideFileEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuideFileRepository extends CrudRepository<GuideFileEntity,Long> {
    List<GuideFileEntity> findByGuideId(Long guideId);
}
