package com.ani.rest.bankrestapp.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class BankUser { // bank_user

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId; // user_id

    @Column(nullable = false)
    private String acNm; // ac_nm

    @Column(unique = true, nullable = false)
    private String acNum; // ac_num

    @Column
    private LocalDate created; // created
}
