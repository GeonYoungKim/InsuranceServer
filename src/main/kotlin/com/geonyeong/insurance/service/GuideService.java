package com.geonyeong.insurance.service;

import com.geonyeong.insurance.dto.*;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@Service
public class GuideService {

    @Inject
    private GuideDao guideDao;


    public List<Kind> selectKind() {
        return guideDao.selectKind();
    }

    public List<Kind> selectCompany(long kindId) {
        return guideDao.selectCompany(kindId);
    }

    public List<Guide> selectGuide(long kindCompanyId) {
        Gson gson = new Gson();
        List<JoinGuide> joinGuideList = guideDao.selectJoinGuide(kindCompanyId);
        List<Guide> guideList = new ArrayList<Guide>();
        List<GuideContent> guideContents = null;
        List<GuideFile> guideFiles = null;
        Guide guide = new Guide();
        long guideNo = 0;
        for (int i = 0; i < joinGuideList.size(); i++) {
            if (guideNo == joinGuideList.get(i).getGuideNo()) {
                if (joinGuideList.get(i).getGuideContentNo() != joinGuideList.get(i - 1).getGuideContentNo()) {
                    addGuideContent(guideContents, joinGuideList.get(i).getGuideContentNo(), joinGuideList.get(i).getGuideContentContent());
                }
                if (joinGuideList.get(i).getGuideFileNo() != joinGuideList.get(i - 1).getGuideFileNo()) {
                    addGuideFile(guideFiles, joinGuideList.get(i).getGuideFileNo(), joinGuideList.get(i).getGuideFileRoute(), joinGuideList.get(i).getGuideFilePreview(), joinGuideList.get(i).getGuideFileTitle());
                }
            } else {
                addGuide(guideList, guide, guideFiles, guideContents);
                guide = new Guide();
                guide.setGuideNo(joinGuideList.get(i).getGuideNo());
                guide.setGuideNo(joinGuideList.get(i).getGuideNo());
                guide.setKindCompanyId(joinGuideList.get(i).getGuideId());
                guide.setGuideTitle(joinGuideList.get(i).getGuideTitle());
                guideContents = new ArrayList<GuideContent>();
                guideFiles = new ArrayList<GuideFile>();

                addGuideContent(guideContents, joinGuideList.get(i).getGuideContentNo(), joinGuideList.get(i).getGuideContentContent());
                addGuideFile(guideFiles, joinGuideList.get(i).getGuideFileNo(), joinGuideList.get(i).getGuideFileRoute(), joinGuideList.get(i).getGuideFilePreview(), joinGuideList.get(i).getGuideFileTitle());

                guideNo = joinGuideList.get(i).getGuideNo();
            }
            if ((joinGuideList.size() - 1) == i) {
                addGuide(guideList, guide, guideFiles, guideContents);
                guideList.remove(0);
            }
        }
        return guideList;
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
        return guideDao.selectTip(kindCompanyId);
    }
}
