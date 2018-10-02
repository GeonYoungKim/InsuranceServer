package com.geonyeong.insurance.service;

import com.geonyeong.insurance.dto.GuideFileDto;
import com.geonyeong.insurance.entity.GuideFileEntity;
import com.geonyeong.insurance.repository.GuideFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    @Autowired
    private GuideFileRepository guideFileRepository;

    public GuideFileEntity selectOneFile(GuideFileDto guideFileDto) {
        return guideFileRepository.findByGuideIdAndGuideNoAndNo(guideFileDto.getGuideId(),guideFileDto.getGuideNo(),guideFileDto.getNo());
    }
}
