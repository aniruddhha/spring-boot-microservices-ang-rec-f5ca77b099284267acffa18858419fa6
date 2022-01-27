package com.ani.rest.bankrestapp.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode
@NoArgsConstructor // default
@AllArgsConstructor // parameterized
@Setter // all setters
@Getter // all getters
@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(nullable = false)
    String acNm;

    @Column(unique = true, nullable = false)
    String acNum;

    @Column(nullable = false)
    double balance;

    @Column(nullable = false)
    LocalDate lstTxn;

    @Column(nullable = false)
    int txnTyp;
}
