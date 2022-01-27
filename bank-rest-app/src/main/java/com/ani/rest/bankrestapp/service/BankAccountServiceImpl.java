package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.domain.BankAccount;
import com.ani.rest.bankrestapp.dto.BankAccountDto;
import com.ani.rest.bankrestapp.dto.NameBalanceDto;
import com.ani.rest.bankrestapp.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired // hey spring give me the object that you have created
    private BankAccountRepository repository;

    @Override
    public int createNewAccount(BankAccountDto dto) {
        BankAccount ba = repository.save(
                new BankAccount(
                        0L,
                        dto.getAcNm(),
                        dto.getAcNum(),
                        dto.getBalance(),
                        dto.getLstTxn(),
                        0
                )
        );

        return ba!= null ? 1 : 0;
    }

    @Override
    public double checkBalance(String num) {

        BankAccount ba = repository.findByAcNum(num);
        return ba.getBalance() ;
    }

    @Override
    public NameBalanceDto findNameBalance(String acNum) {
        BankAccount ba = repository.findByAcNum(acNum);
        return new NameBalanceDto(ba.getAcNm(), ba.getBalance());
    }
}
