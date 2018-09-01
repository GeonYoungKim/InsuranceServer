package com.geonyeong.insurance.repository;

import com.geonyeong.insurance.entity.KindCompanyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KindCompanyRepository extends CrudRepository<KindCompanyEntity,Long> {
    List<KindCompanyEntity> findByKindEntity_Id(Long kind_id);
}
