package com.example.arirangfirst.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResultQueryRepositoryTest {

    private final ResultQueryRepository resultQueryRepository;

    @Autowired
    private ResultQueryRepositoryTest(ResultQueryRepository resultQueryRepository) {
        this.resultQueryRepository = resultQueryRepository;
    }

    @Test
    void findCertificatePassRateTest() {

    }
}