package com.ani.rest.bankrestapp.dto;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BankAccountDto {
    long id;
    String acNm;
    String acNum;
    double balance;
    LocalDate lstTxn;
    int txnTyp;
}
