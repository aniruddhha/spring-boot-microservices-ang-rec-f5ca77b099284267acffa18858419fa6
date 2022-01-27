package com.ani.rest.bankrestapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class NameBalanceDto {
    private String acNm;
    private double balance;
}
