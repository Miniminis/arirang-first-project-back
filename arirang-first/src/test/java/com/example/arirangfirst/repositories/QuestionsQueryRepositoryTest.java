package com.example.arirangfirst.repositories;

import com.example.arirangfirst.networks.responses.QuestionsInfoResDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuestionsQueryRepositoryTest {

    private final QuestionsQueryRepository questionsQueryRepository;

    @Autowired
    QuestionsQueryRepositoryTest(QuestionsQueryRepository questionsQueryRepository) {
        this.questionsQueryRepository = questionsQueryRepository;
    }

    @Test
    void 질문지_조회() {
        QuestionsInfoResDto questionsInfoResDto = questionsQueryRepository.findQuestionsAndAnswers();
        System.out.println(questionsInfoResDto);
    }
}