package com.geonyeong.insurance.entity;


import com.geonyeong.insurance.dto.GuideIdDto;
import com.geonyeong.insurance.dto.TipIdDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tip")
@IdClass(TipIdDto.class)
@Getter
@Setter
public class TipEntity {
    @Id
    private @Column(name = "guide_id") Long guideId;
    @Id
    private @Column(name = "no") Long no;
    private @Column(name = "content") String content;
}
