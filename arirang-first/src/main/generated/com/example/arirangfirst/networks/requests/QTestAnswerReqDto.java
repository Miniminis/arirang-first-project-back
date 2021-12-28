package com.example.arirangfirst.networks.requests;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.example.arirangfirst.networks.requests.QTestAnswerReqDto is a Querydsl Projection type for TestAnswerReqDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QTestAnswerReqDto extends ConstructorExpression<TestAnswerReqDto> {

    private static final long serialVersionUID = 2137959519L;

    public QTestAnswerReqDto(com.querydsl.core.types.Expression<Long> questionId, com.querydsl.core.types.Expression<String> answerText) {
        super(TestAnswerReqDto.class, new Class<?>[]{long.class, String.class}, questionId, answerText);
    }

}

