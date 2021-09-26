package com.example.arirangfirst.repositories;

import com.example.arirangfirst.networks.responses.CertificateResDto;
import com.example.arirangfirst.networks.responses.ResultResDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.arirangfirst.domains.QCertificate.certificate;
import static com.example.arirangfirst.domains.QResult.result;

@Repository
@RequiredArgsConstructor
public class ResultQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public CertificateResDto findSingleResult(Long resultId) {
        return jpaQueryFactory.from(result)
                .leftJoin(result.certificate, certificate)
                .where(result.resultId.eq(resultId))
                .select(Projections.fields(CertificateResDto.class,
                        result.testerName,
                        result.totalRightCnt,
                        certificate.imgUrl,
                        certificate.title,
                        certificate.content,
                        certificate.passRate
                        ))
                .fetchOne();
    }

    public Float findCertificatePassRate(Long certificateId) {
        Long totalCnt = jpaQueryFactory.selectFrom(result)
                .fetchCount();

        Long levelCnt = jpaQueryFactory.from(result)
                .where(result.certificate.certificateId.eq(certificateId))
                .fetchCount();

        return (float) ((levelCnt / totalCnt) * 100);
    }
}
