package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.domain.BankUser;

import java.util.List;

public interface BankUserService {
    BankUser saveBankUser(BankUser user);

    List<BankUser> searchAllUsers(String name);

    List<BankUser> searchByAcNum(String num);

    List<BankUser> findAllUsers();

    int updateUserName(Long id, String newName);
}
