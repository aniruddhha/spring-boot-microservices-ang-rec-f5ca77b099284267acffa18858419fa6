package com.ani.simple.domain;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BankUser {
    private long id;
    private String acNum;
    private String acNm;
    private double balance;
    private LocalDate lastTxn;
    private int txnType;
}
