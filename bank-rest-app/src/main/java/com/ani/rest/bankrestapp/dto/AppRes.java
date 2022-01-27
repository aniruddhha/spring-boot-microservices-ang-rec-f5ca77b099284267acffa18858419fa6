package com.ani.rest.bankrestapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppRes<T> {
    private String sts;
    private String msg;
    private T res;
}
