package com.example.arirangfirst.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Tests tests;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "certificate")
    private List<Result> results;

    private Integer level;

    private Integer standardCnt;

    private String imgUrl;

    private String title;

    private String content;

    private Float passRate;

}
