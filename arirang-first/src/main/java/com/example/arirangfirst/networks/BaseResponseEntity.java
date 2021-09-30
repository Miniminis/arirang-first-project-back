package com.example.arirangfirst.networks;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponseEntity<T> {

    private int statusCode;

    private String message;

    private T data;

    public static <T> BaseResponseEntity<T> OK() {
        return (BaseResponseEntity<T>) BaseResponseEntity.builder()
                .statusCode(HttpStatus.OK.value())
                .build();
    }

    public static <T> BaseResponseEntity<T> OK(T data) {
        return (BaseResponseEntity<T>) BaseResponseEntity.builder()
                .statusCode(HttpStatus.OK.value())
                .data(data)
                .build();
    }

    public static <T> BaseResponseEntity<T> ERROR() {
        return (BaseResponseEntity<T>) BaseResponseEntity.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();
    }

}
