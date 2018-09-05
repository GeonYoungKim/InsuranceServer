package com.geonyeong.insurance.entity;

import com.geonyeong.insurance.dto.GuideIdDto;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "guide_file")
@IdClass(GuideIdDto.class)
@Getter
@Setter
public class GuideFileEntity {
    @Id
    private @Column(name = "guide_id") Long guideId;
    @Id
    private @Column(name = "guide_no") Long guideNo;
    @Id
    private @Column(name = "no") Long no;
    private @Column(name = "route") String route;
    private @Column(name = "title") String title;
    @ColumnDefault("NULL")
    private @Column(name = "preview") String preview;
}
