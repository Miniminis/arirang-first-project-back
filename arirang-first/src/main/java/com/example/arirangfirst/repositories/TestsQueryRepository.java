package com.example.arirangfirst.repositories;

import com.example.arirangfirst.domains.Tests;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.arirangfirst.domains.QTests.tests;

@Repository
@RequiredArgsConstructor
public class TestsQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public Tests findSingleTest(Long testId) {
        return jpaQueryFactory.selectFrom(tests)
                .where(tests.testId.eq(testId))
                .fetchOne();
    }

}
