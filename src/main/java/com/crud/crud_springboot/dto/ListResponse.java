package com.crud.crud_springboot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResponse<T> extends Response<List<T>>{

    public ListResponse(int code, String message, List<T> data) {
        super(code, message, data);
    }
}
