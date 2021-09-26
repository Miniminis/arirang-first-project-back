package com.example.arirangfirst.networks.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultResDto {

    private Long resultId;

    private Long testId;

    private Integer totalRightCnt;

    private String testerName;

}
