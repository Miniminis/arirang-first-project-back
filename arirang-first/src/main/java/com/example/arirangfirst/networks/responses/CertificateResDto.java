package com.example.arirangfirst.networks.responses;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class CertificateResDto {

    private Long resultId;

    private String testerName;

    private Integer totalRightCnt;

    private String certificateImgUrl;

    private String title;

    private String content;

    private Float passRate;

    private Integer level;

    @QueryProjection
    public CertificateResDto(Long resultId, String testerName, Integer totalRightCnt, String certificateImgUrl,
                             String title, String content, Float passRate, Integer level) {
        this.resultId = resultId;
        this.testerName = testerName;
        this.totalRightCnt = totalRightCnt;
        this.certificateImgUrl = certificateImgUrl;
        this.title = title;
        this.content = content;
        this.passRate = passRate;
        this.level = level;
    }

}
