package com.example.arirangfirst.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class AnswersQueryRepositoryTest {

    private final AnswersQueryRepository answersQueryRepository;

    @Autowired
    private AnswersQueryRepositoryTest(AnswersQueryRepository answersQueryRepository) {
        this.answersQueryRepository = answersQueryRepository;
    }

    @Test
    void test() {
        Map<Long, String> answers = answersQueryRepository.findRightAnswers(1L);
        System.out.println(answers);
    }
}