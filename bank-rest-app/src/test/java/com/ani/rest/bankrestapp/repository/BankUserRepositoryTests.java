package com.ani.rest.bankrestapp.repository;

import com.ani.rest.bankrestapp.domain.BankUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest()
public class BankUserRepositoryTests {

    @Autowired
    private BankUserRepository repository;

    @Order(1)
    @DisplayName("Repo : checking repo loaded")
    @Test
    void testRepoExists(){
        Assertions.assertNotNull(repository);
    }

    @Order(2)
    @DisplayName("Repo : Creating New User")
    @Test
    void testCreateNewUser(){
        BankUser ip = new BankUser(
                1L,
                "abc",
                "1234",
                LocalDate.of(2021, 1, 1)
        );

        BankUser saved = repository.save(ip);
        Assertions.assertEquals(ip, saved);
    }

    @Order(3)
    @DisplayName("Repo : Checking Account Name")
    @Test
    void testAccountName() {
        BankUser ip = new BankUser(
                1L,
                "abc",
                "807",
                LocalDate.of(2021, 1, 1)
        );

        BankUser saved = repository.save(ip);

        List<BankUser> users = repository.findByAcNm("abc");
        Assertions.assertEquals(1, users.size());
    }
}
