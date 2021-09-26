package com.example.arirangfirst.domains.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum YesNo {

    Y("yes"),
    N("no");

    private final String description;
}
