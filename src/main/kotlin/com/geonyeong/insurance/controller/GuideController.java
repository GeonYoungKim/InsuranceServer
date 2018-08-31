package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.dto.Guide;
import com.geonyeong.insurance.dto.Kind;
import com.geonyeong.insurance.dto.Tip;
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

	@GetMapping("/kind")
	public @ResponseBody
    String kind() {
		System.out.println("보험 종류 반환");
		List<Kind> kinds=guideService.selectKind();
		return gson.toJson(kinds);

	}
	@GetMapping("/company/{kindId}")
	public @ResponseBody
    String company(@PathVariable long kindId) {
		System.out.println("회사 종류 반환");
		List<Kind> kindCompanies=guideService.selectCompany(kindId);
		System.out.println(gson.toJson(kindCompanies));
		return gson.toJson(kindCompanies);
	}
	@GetMapping("/select/{kindCompanyId}")
	public @ResponseBody
    String guide(@PathVariable long kindCompanyId) {
		System.out.println("보험 선택");
		Map<String,Object> map=new HashMap<String,Object>();

		List<Guide> guide=guideService.selectGuide(kindCompanyId);
		List<Tip> tip=guideService.selectTip(kindCompanyId);
		map.put("guide", guide);
		map.put("tip", tip);
		return gson.toJson(map);
	}

}
