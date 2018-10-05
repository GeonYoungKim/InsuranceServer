package com.geonyeong.insurance.service;

import com.geonyeong.insurance.dto.GuideFileDto;
import com.geonyeong.insurance.entity.GuideFileEntity;
import com.geonyeong.insurance.repository.GuideFileRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FileService {

    private final GuideFileRepository guideFileRepository;

    public GuideFileEntity selectOneFile(GuideFileDto guideFileDto) {
        return guideFileRepository.findByGuideIdAndGuideNoAndNo(guideFileDto.getGuideId(),guideFileDto.getGuideNo(),guideFileDto.getNo());
    }
}
