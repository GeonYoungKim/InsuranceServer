package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.GuideContentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuideContentRepository extends CrudRepository<GuideContentEntity,Long> {
    List<GuideContentEntity> findByGuideId(Long guideId);
}
