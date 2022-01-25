package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.domain.BankUser;
import com.ani.rest.bankrestapp.repository.BankUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class BankUserServiceImpl implements BankUserService {

    @Autowired
    private BankUserRepository repository;

    @Override
    public BankUser saveBankUser(BankUser user) {
        return repository.save(user);
    }

    @Override
    public List<BankUser> searchAllUsers(String name) {
        return repository.findByAcNm(name);
    }

    @Override
    public List<BankUser> searchByAcNum(String num) {
        return repository.findByAcNumStartingWith(num);
    }

    @Override
    public List<BankUser> findAllUsers() {
        return repository.findAll();
    }

    //ACID =
    @Transactional(rollbackFor = SQLException.class)
    @Override
    public int updateUserName(Long id, String newName) {
        return repository.updateNamesdfljslgjskhgksdfh(id, newName);
    }
}
