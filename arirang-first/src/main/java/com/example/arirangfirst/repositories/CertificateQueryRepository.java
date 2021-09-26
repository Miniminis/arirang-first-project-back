package com.example.arirangfirst.repositories;

import com.example.arirangfirst.domains.Certificate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.arirangfirst.domains.QCertificate.certificate;

@Repository
@RequiredArgsConstructor
public class CertificateQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public Certificate findCertificate(Long testId, Integer totalRightCnt) {
        return jpaQueryFactory.selectFrom(certificate)
                .where(certificate.tests.testId.eq(testId),
                        certificate.standardCnt.loe(totalRightCnt))
                .orderBy(certificate.level.asc())
                .fetchFirst();
    }

    public Long updatePassRate(Long certificateId, Float passRate) {
        return jpaQueryFactory.update(certificate)
                .where(certificate.certificateId.eq(certificateId))
                .set(certificate.passRate, passRate)
                .execute();
    }

}
