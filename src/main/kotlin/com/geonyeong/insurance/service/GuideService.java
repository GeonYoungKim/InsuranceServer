package com.geonyeong.insurance.service;

import com.geonyeong.insurance.dto.*;
import com.geonyeong.insurance.entity.KindCompanyEntity;
import com.geonyeong.insurance.entity.KindEntity;
import com.geonyeong.insurance.repository.KindCompanyRepository;
import com.geonyeong.insurance.repository.KindRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuideService {
    @Autowired
    private KindRepository kindRepository;
    @Autowired
    private KindCompanyRepository kindCompanyRepository;

//    @Inject
//    private GuideDao guideDao;


    public List<KindEntity> selectKind() {
        return (List<KindEntity>) kindRepository.findAll();
    }

    public List<KindCompanyEntity> selectCompany(long kindId) {
        return (List<KindCompanyEntity>) kindCompanyRepository.findByKindEntity_Id(kindId);
    }

    public /*List<KindCompanyEntity>*/ void selectTest() {
//        KindCompany kindCompany = new KindCompany();
//        kindCompany.setKind_id(Long.valueOf(1));
//        System.out.println(kindCompanyRepository.findAll());
//        return byId;
    }

    public List<KindEntity> selectGuide() {
        Gson gson = new Gson();
        List<KindCompanyEntity> companyEntities = (List<KindCompanyEntity>) kindCompanyRepository.findByKindEntity_Id(Long.valueOf(1));
        System.out.println(companyEntities);
        System.out.println(companyEntities.size());
        for(KindCompanyEntity companyEntity : companyEntities){
            System.out.println(companyEntity.getId()+"               "+companyEntity.getKindEntity().getName()+"               "+companyEntity.getCompanyEntity().getName());
        }
//        System.out.println(gson.toJson(kindRepository.findById(Long.valueOf(1))));
        return /*(List<KindEntity>) kindRepository.findAll()*/null;
    }

    public List<Guide> selectGuide(long kindCompanyId) {
//        Gson gson = new Gson();
//        List<JoinGuide> joinGuideList = guideDao.selectJoinGuide(kindCompanyId);
//        List<Guide> guideList = new ArrayList<Guide>();
//        List<GuideContent> guideContents = null;
//        List<GuideFile> guideFiles = null;
//        Guide guide = new Guide();
//        long guideNo = 0;
//        for (int i = 0; i < joinGuideList.size(); i++) {
//            if (guideNo == joinGuideList.get(i).getGuideNo()) {
//                if (joinGuideList.get(i).getGuideContentNo() != joinGuideList.get(i - 1).getGuideContentNo()) {
//                    addGuideContent(guideContents, joinGuideList.get(i).getGuideContentNo(), joinGuideList.get(i).getGuideContentContent());
//                }
//                if (joinGuideList.get(i).getGuideFileNo() != joinGuideList.get(i - 1).getGuideFileNo()) {
//                    addGuideFile(guideFiles, joinGuideList.get(i).getGuideFileNo(), joinGuideList.get(i).getGuideFileRoute(), joinGuideList.get(i).getGuideFilePreview(), joinGuideList.get(i).getGuideFileTitle());
//                }
//            } else {
//                addGuide(guideList, guide, guideFiles, guideContents);
//                guide = new Guide();
//                guide.setGuideNo(joinGuideList.get(i).getGuideNo());
//                guide.setGuideNo(joinGuideList.get(i).getGuideNo());
//                guide.setKindCompanyId(joinGuideList.get(i).getGuideId());
//                guide.setGuideTitle(joinGuideList.get(i).getGuideTitle());
//                guideContents = new ArrayList<GuideContent>();
//                guideFiles = new ArrayList<GuideFile>();
//
//                addGuideContent(guideContents, joinGuideList.get(i).getGuideContentNo(), joinGuideList.get(i).getGuideContentContent());
//                addGuideFile(guideFiles, joinGuideList.get(i).getGuideFileNo(), joinGuideList.get(i).getGuideFileRoute(), joinGuideList.get(i).getGuideFilePreview(), joinGuideList.get(i).getGuideFileTitle());
//
//                guideNo = joinGuideList.get(i).getGuideNo();
//            }
//            if ((joinGuideList.size() - 1) == i) {
//                addGuide(guideList, guide, guideFiles, guideContents);
//                guideList.remove(0);
//            }
//        }
//        return guideList;
        return null;
    }

    private void addGuide(List<Guide> guideList, Guide guide, List<GuideFile> guideFiles, List<GuideContent> guideContents) {
        guide.setGuideContents(guideContents);
        guide.setGuideFiles(guideFiles);
        guideList.add(guide);
    }

    private void addGuideFile(List<GuideFile> guideFiles, long gfNo, String gfRoute, String gfPreview, String gfTitle) {
        GuideFile guideFile = new GuideFile();
        guideFile.setNo(gfNo);
        guideFile.setRoute(gfRoute);
        guideFile.setPreview(gfPreview);
        guideFile.setTitle(gfTitle);
        guideFiles.add(guideFile);
    }

    private void addGuideContent(List<GuideContent> guideContents, long gcNo, String gcContent) {
        GuideContent guideContent = new GuideContent();
        guideContent.setNo(gcNo);
        guideContent.setContent(gcContent);
        guideContents.add(guideContent);
    }

    public List<Tip> selectTip(long kindCompanyId) {
//        return guideDao.selectTip(kindCompanyId);
        return null;
    }
}
