package com.ani.rest.bankrestapp.rest;

import com.ani.rest.bankrestapp.domain.BankUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BankUserRestApiTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    // what is unit testing ?
    /*
    * For given set of input
    * what is expected and actual output
    *
    * */
    @DisplayName("REST - Create New User")
    @Test
    void testCreateNewUser(){
        String url = "http://localhost:"+port+"/user";

        BankUser user = new BankUser(
                1L,
                "abc",
                "123456",
                LocalDate.of(2021, 1, 1)
        );

        ResponseEntity<BankUser> entity = template.postForEntity(
                url,
                user,
                BankUser.class
        );

        Assertions.assertEquals(HttpStatus.CREATED, entity.getStatusCode());
    }

    @DisplayName("REST - Create New User Object Equality")
    @Test
    void testCreateNewUserObject() {
        String url = "http://localhost:"+port+"/user";

        BankUser user = new BankUser(
                1L,
                "abc",
                "123456",
                LocalDate.of(2021, 1, 1)
        );

        ResponseEntity<BankUser> entity = template.postForEntity(
                url,
                user,
                BankUser.class
        );

        BankUser userFromRes = entity.getBody();

        Assertions.assertEquals(user, userFromRes);
    }

    @DisplayName("REST - Account Number Api")
    @Test
    void testAccountNumber() {
        String url = "http://localhost:"+port+"/user/number/123";
        ResponseEntity<List<BankUser>> entity = template.exchange(
                url,
                HttpMethod.GET,
                null, // request body pass as null
                new ParameterizedTypeReference<List<BankUser>>() {}
        );
        Assertions.assertEquals(HttpStatus.OK, entity.getStatusCode());
    }
}

