package com.ani.rest.bankrestapp.service;

import com.ani.rest.bankrestapp.domain.BankUser;
import com.ani.rest.bankrestapp.repository.BankUserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class BankServiceTests {

    @Mock
    private BankUserRepository repository;

    @InjectMocks
    private BankUserServiceImpl service;

    @DisplayName("TEST - Account Number Testing")
    @Test
    void testAccountNumber(){

        BankUser user1 = new BankUser(1L, "abc", "12343212", LocalDate.of(2021,1,2));
        BankUser user2 = new BankUser(2L, "pqr", "423324", LocalDate.of(2021,1,2));

        ArrayList<BankUser> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        Mockito.when(
                service.searchByAcNum("42")
        ).thenReturn(
               users
        );

        service.searchByAcNum("42");

        List<BankUser> resUsrs = service.searchByAcNum("42");
        Assertions.assertEquals(2, resUsrs.size());

        Mockito.verify(
                repository,
                Mockito.times(2)
        ).findByAcNumStartingWith("42");
    }
}
