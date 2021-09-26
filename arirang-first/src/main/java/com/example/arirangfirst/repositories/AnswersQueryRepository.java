package com.example.arirangfirst.repositories;

import com.example.arirangfirst.domains.enums.YesNo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Map;

import static com.example.arirangfirst.domains.QAnswers.answers;
import static com.querydsl.core.group.GroupBy.groupBy;

@Repository
@RequiredArgsConstructor
public class AnswersQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;


    public Map<Long,String> findRightAnswers(Long testId) {
        return jpaQueryFactory.from(answers)
                .where(answers.tests.testId.eq(testId),
                        answers.rightYn.eq(YesNo.Y))
                .transform(groupBy(answers.questions.questionId).as(answers.answer));
    }
}
