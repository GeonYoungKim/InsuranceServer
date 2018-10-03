package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.TipEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipRepository extends JpaRepository<TipEntity,Long> {
    List<TipEntity> findByGuideId(Long guideId);
}
