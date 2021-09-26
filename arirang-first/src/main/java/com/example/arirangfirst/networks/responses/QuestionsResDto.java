package com.example.arirangfirst.networks.responses;

import com.example.arirangfirst.domains.enums.QuestionType;
import lombok.*;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsResDto {

    private Long questionId;

    private QuestionType type;

    private Integer seq;

    private String title;

    private String question;

    private List<AnswersResDto> answers;

}
