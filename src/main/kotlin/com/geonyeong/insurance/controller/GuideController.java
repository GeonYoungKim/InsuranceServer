package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.dto.InsulanceDto;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import com.geonyeong.insurance.entity.KindEntity;
import com.geonyeong.insurance.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/guide/*")
public class GuideController {

	@Autowired
	private GuideService guideService;

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
	public @ResponseBody
	InsulanceDto guide(@PathVariable long kindCompanyId) {
		System.out.println("보험 선택");
		return guideService.selectOneInsurance(kindCompanyId);
	}
}
