package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.dto.GuideContentId;
import com.geonyeong.insurance.entity.GuideContentEntity;
import com.geonyeong.insurance.entity.GuideEntity;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuideContentRepository extends CrudRepository<GuideContentEntity,Long> {
    List<GuideContentEntity> findByGuideId(Long guideId);
}
