package com.example.arirangfirst.domains.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestionType {

    NUMBER("객관식"),
    TEXT("주관식");

    private final String questionType;

}
