package com.example.arirangfirst.domains;

import com.example.arirangfirst.domains.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Tests tests;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Questions questions;

    private Integer seq;

    private String answer;

    @Enumerated(EnumType.STRING)
    private YesNo rightYn;

    @Enumerated(EnumType.STRING)
    private YesNo useYn;

}
