package com.ani.rest.bankrestapp.repository;

import com.ani.rest.bankrestapp.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    BankAccount findByAcNum(String num);

    @Query(value = "select ac_nm, balance from bank_account where ac_num = :acNum limit 2",nativeQuery = true)
    List<BankAccount> findOnlyTwo(@Param("acNum") String acNum);
}
