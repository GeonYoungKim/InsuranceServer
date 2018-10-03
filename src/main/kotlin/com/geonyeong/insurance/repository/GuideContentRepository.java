package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.GuideContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuideContentRepository extends JpaRepository<GuideContentEntity,Long> {
    List<GuideContentEntity> findByGuideId(Long guideId);
}
