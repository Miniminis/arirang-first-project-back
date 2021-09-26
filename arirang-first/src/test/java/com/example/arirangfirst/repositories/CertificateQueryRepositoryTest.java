package com.example.arirangfirst.repositories;

import com.example.arirangfirst.domains.Certificate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CertificateQueryRepositoryTest {

    private final CertificateQueryRepository certificateQueryRepository;

    @Autowired
    private CertificateQueryRepositoryTest(CertificateQueryRepository certificateQueryRepository) {
        this.certificateQueryRepository = certificateQueryRepository;
    }

    @Test
    void findCertificateTest() {
        Certificate certificate = certificateQueryRepository.findCertificate(1L, 9);
        assertThat(certificate.getLevel()).isEqualTo(1);
    }

}