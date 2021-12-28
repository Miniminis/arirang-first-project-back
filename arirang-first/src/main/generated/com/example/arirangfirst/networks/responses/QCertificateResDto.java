package com.example.arirangfirst.networks.responses;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.example.arirangfirst.networks.responses.QCertificateResDto is a Querydsl Projection type for CertificateResDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QCertificateResDto extends ConstructorExpression<CertificateResDto> {

    private static final long serialVersionUID = 796865982L;

    public QCertificateResDto(com.querydsl.core.types.Expression<Long> resultId, com.querydsl.core.types.Expression<String> testerName, com.querydsl.core.types.Expression<Integer> totalRightCnt, com.querydsl.core.types.Expression<String> certificateImgUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<Float> passRate, com.querydsl.core.types.Expression<Integer> level) {
        super(CertificateResDto.class, new Class<?>[]{long.class, String.class, int.class, String.class, String.class, String.class, float.class, int.class}, resultId, testerName, totalRightCnt, certificateImgUrl, title, content, passRate, level);
    }

}

