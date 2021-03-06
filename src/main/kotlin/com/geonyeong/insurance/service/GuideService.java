package com.geonyeong.insurance.service;

import com.geonyeong.insurance.dto.GuideDto;
import com.geonyeong.insurance.dto.InsulanceDto;
import com.geonyeong.insurance.entity.*;
import com.geonyeong.insurance.repository.*;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class GuideService {

    private final KindRepository kindRepository;

    private final KindCompanyRepository kindCompanyRepository;

    private final GuideRepository guideRepository;

    private final GuideContentRepository guideContentRepository;

    private final GuideFileRepository guideFileRepository;

    private final TipRepository tipRepository;

    private final Gson gson;

    public List<KindEntity> selectKind() {
        return (List<KindEntity>) kindRepository.findAll();
    }

    public List<KindCompanyEntity> selectCompany(long kindId) {
        return kindCompanyRepository.findByKindEntity_Id(kindId);
    }
    public InsulanceDto selectOneInsurance(long kindCompanyId) {
        List<GuideContentEntity> guideContentEntityList = guideContentRepository.findByGuideId(kindCompanyId);
        List<GuideFileEntity> guideFileEntityList = guideFileRepository.findByGuideId(kindCompanyId);
        List<TipEntity> tipEntityList = tipRepository.findByGuideId(kindCompanyId);
        KindCompanyEntity kindCompanyEntity = new KindCompanyEntity(kindCompanyId,null,null,null);

        List<GuideDto> guideDtoList = new ArrayList<>();
        GuideDto guideDto;
        List<GuideEntity> guideEntities = guideRepository.findByKindCompanyEntity(kindCompanyEntity);
        for(GuideEntity guideEntity : guideEntities){
            guideDto = new GuideDto(
                    guideEntity.getNo(),
                    guideEntity.getTitle(),
                    guideContentEntityList.stream().filter(guideContentEntity -> guideContentEntity.getGuideNo() == guideEntity.getNo()).collect(Collectors.toList()),
                    guideFileEntityList.stream().filter(guideFileEntity -> guideFileEntity.getGuideNo() == guideEntity.getNo()).collect(Collectors.toList())
            );
            guideDtoList.add(guideDto);
        }
        return new InsulanceDto(guideDtoList,tipEntityList);
    }
}

