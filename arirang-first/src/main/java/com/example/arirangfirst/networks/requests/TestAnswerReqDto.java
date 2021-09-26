package com.example.arirangfirst.networks.requests;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@ToString
@NoArgsConstructor
public class TestAnswerReqDto {

    @NotNull
    private Long questionId;

    @NotNull
    private String answerText;

    @QueryProjection
    public TestAnswerReqDto(Long questionId, String answerText) {
        this.questionId = questionId;
        this.answerText = answerText;
    }
}
