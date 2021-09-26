package com.example.arirangfirst.domains;

import com.example.arirangfirst.domains.enums.QuestionType;
import com.example.arirangfirst.domains.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Tests tests;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "questions")
    private List<Answers> answers;

    @Enumerated(EnumType.STRING)
    private QuestionType type;

    private Integer seq;

    private String seqText;

    private String question;

    @Enumerated(EnumType.STRING)
    private YesNo useYn;

}
