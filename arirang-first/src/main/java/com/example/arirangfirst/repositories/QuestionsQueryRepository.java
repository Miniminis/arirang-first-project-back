package com.example.arirangfirst.repositories;

import com.example.arirangfirst.domains.enums.YesNo;
import com.example.arirangfirst.networks.requests.TestAnswerReqDto;
import com.example.arirangfirst.networks.responses.AnswersResDto;
import com.example.arirangfirst.networks.responses.QuestionsInfoResDto;
import com.example.arirangfirst.networks.responses.QuestionsResDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.arirangfirst.domains.QAnswers.answers;
import static com.example.arirangfirst.domains.QQuestions.questions;
import static com.querydsl.core.group.GroupBy.groupBy;
import static com.querydsl.core.group.GroupBy.list;

@Repository
@RequiredArgsConstructor
public class QuestionsQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public QuestionsInfoResDto findQuestionsAndAnswers() {
         List<QuestionsResDto> questionsResDtos = jpaQueryFactory.from(questions)
                .leftJoin(questions.answers, answers)
                .where(questions.useYn.eq(YesNo.Y),
                        answers.useYn.eq(YesNo.Y),
                        questions.tests.testId.eq(1L),
                        answers.tests.testId.eq(1L))
                .orderBy(questions.seq.asc(),
                        answers.seq.asc())
                .transform(groupBy(questions.questionId)
                .list(Projections.fields(QuestionsResDto.class,
                        questions.questionId,
                        questions.type,
                        questions.seq,
                        questions.seqText.as("title"),
                        questions.question,
                        list(Projections.fields(AnswersResDto.class,
                                answers.answerId,
                                answers.seq,
                                answers.answer
                                )).as("answers"))
                ));

        return QuestionsInfoResDto.builder()
                .questions(questionsResDtos)
                .build();
    }

}
