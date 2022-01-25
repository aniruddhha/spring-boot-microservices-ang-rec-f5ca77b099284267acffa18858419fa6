package com.ani.rest.bankrestapp.repository;

import com.ani.rest.bankrestapp.domain.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankUserRepository extends JpaRepository<BankUser, Long> {

    List<BankUser> findByAcNm(String nm);

    List<BankUser> findByAcNumStartingWith(String num);

    @Query(value = "select * from bank_user", nativeQuery = true)
    List<BankUser> findAllWithNative();

    @Query(value = "select bu from BankUser bu")
    List<BankUser> findAllWithJpql() ;

    @Modifying
    @Query(value = "update bank_user set ac_nm = :acNm where user_id = :usrId",nativeQuery = true)
    int updateNamesdfljslgjskhgksdfh(
            @Param("usrId") Long usrId,
            @Param("acNm") String acNm
    );
}
