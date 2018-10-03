package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.GuideFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuideFileRepository extends JpaRepository<GuideFileEntity,Long> {
    List<GuideFileEntity> findByGuideId(Long guideId);
    GuideFileEntity findByGuideIdAndGuideNoAndNo(Long guideId,Long guideNo,Long no);
}
