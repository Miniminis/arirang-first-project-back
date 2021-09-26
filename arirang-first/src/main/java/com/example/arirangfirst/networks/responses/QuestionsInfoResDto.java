package com.example.arirangfirst.networks.responses;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsInfoResDto {

    private List<QuestionsResDto> questions;

}
