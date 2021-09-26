package com.example.arirangfirst.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tests")
    private List<Result> results;

    private String type;

    private String name;

    private String testUrl;

    private String thumbnailImgUrl;

}
