package com.example.arirangfirst.networks.responses;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CertificateResDto {

    private String testerName;

    private Integer totalRightCnt;

    private String certificateImgUrl;

    private String title;

    private String content;

    private Float passRate;



    @QueryProjection
    public CertificateResDto(String certificateImgUrl,
                             String title,
                             String content,
                             Float passRate) {
        this.certificateImgUrl = certificateImgUrl;
        this.title = title;
        this.content = content;
        this.passRate = passRate;
    }

    public void buildTesterInfo(String testerName, Integer totalRightCnt) {
        this.testerName = testerName;
        this.totalRightCnt = totalRightCnt;
    }


}
