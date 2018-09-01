package com.geonyeong.insurance.entity;

import com.geonyeong.insurance.dto.GuideContentId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "guide_content")
@IdClass(GuideContentId.class)
@Getter
@Setter
public class GuideContentEntity{
    @Id
    private @Column(name = "guide_id") Long guideId;
    @Id
    private @Column(name = "guide_no") Long guideNo;
    @Id
    private @Column(name = "no") Long no;
    private @Column(name = "content") String content;
}
