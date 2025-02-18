package com.example.arirangfirst.networks.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TestResultReqDto {

    @NotNull
    private Long testId;

    private String testerName;

    @NotNull
    private Map<Integer, String> answerMap;

}

