package com.ani.rest.bankrestapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BankAccountRestApiTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

}
