package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.domain.BankAccount;
import com.ani.rest.bankrestapp.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired // hey spring give me the object that you have created
    private BankAccountRepository repository;

    @Override
    public double checkBalance(String num) {

        BankAccount ba = repository.findByAcNum(num);
        return ba.getBalance() ;
    }
}
