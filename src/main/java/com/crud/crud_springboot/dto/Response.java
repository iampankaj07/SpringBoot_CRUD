package com.crud.crud_springboot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Response<T> {
    private int code;
    private String message;
    private T data;
}
