package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.TipEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipRepository extends CrudRepository<TipEntity,Long> {
    List<TipEntity> findByGuideId(Long guideId);
}
