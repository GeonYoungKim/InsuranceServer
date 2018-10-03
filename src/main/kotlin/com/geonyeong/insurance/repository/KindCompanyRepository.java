package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.KindCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KindCompanyRepository extends JpaRepository<KindCompanyEntity,Long> {
    List<KindCompanyEntity> findByKindEntity_Id(Long kind_id);
}
