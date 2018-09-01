package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.dto.Guide;
import com.geonyeong.insurance.dto.GuideContentId;
import com.geonyeong.insurance.dto.Kind;
import com.geonyeong.insurance.dto.Tip;
import com.geonyeong.insurance.entity.GuideContentEntity;
import com.geonyeong.insurance.entity.GuideEntity;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import com.geonyeong.insurance.entity.KindEntity;
import com.geonyeong.insurance.repository.GuideContentRepository;
import com.geonyeong.insurance.repository.GuideRepository;
import com.geonyeong.insurance.service.GuideService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/guide/*")
public class GuideController {

	@Inject
	private GuideService guideService;

	@Autowired
	private Gson gson;

	@Autowired
	private GuideRepository guideRepository;
	@Autowired
	private GuideContentRepository guideContentRepository;

	@GetMapping("/kind")
	public @ResponseBody List<KindEntity> kind() {
		System.out.println("보험 종류 반환");
		List<KindEntity> kinds=guideService.selectKind();
		return kinds;

	}
	@GetMapping("/company/{kindId}")
	public @ResponseBody List<KindCompanyEntity> company(@PathVariable long kindId) {
		System.out.println("회사 종류 반환");
		List<KindCompanyEntity> kindCompanyEntities=guideService.selectCompany(kindId);
		return kindCompanyEntities;
	}
	@GetMapping("/select/{kindCompanyId}")
	public @ResponseBody List<GuideContentEntity> guide(@PathVariable long kindCompanyId) {
		System.out.println("보험 선택");


		KindCompanyEntity kindCompanyEntity = new KindCompanyEntity(kindCompanyId);

//		System.out.println(gson.toJson(guideContentRepository.findByKindCompanyEntity(kindCompanyEntity)));
		return guideContentRepository.findByGuideId(kindCompanyId);
//		return (List<GuideEntity>) guideRepository.findByKindCompanyEntity(kindCompanyEntity);
	}

}
