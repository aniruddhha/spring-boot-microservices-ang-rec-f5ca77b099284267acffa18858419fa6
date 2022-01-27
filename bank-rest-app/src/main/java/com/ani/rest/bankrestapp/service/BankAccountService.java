package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.dto.BankAccountDto;
import com.ani.rest.bankrestapp.dto.NameBalanceDto;

public interface BankAccountService {

    int createNewAccount(BankAccountDto dto);

    double checkBalance(String num);

    NameBalanceDto findNameBalance(String acNum);
}
