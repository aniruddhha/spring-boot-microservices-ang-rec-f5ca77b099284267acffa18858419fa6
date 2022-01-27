package com.ani.rest.bankrestapp.controller;

import com.ani.rest.bankrestapp.domain.BankAccount;
import com.ani.rest.bankrestapp.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bank")
@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @GetMapping("/balance/{acNum}") // GET -> http://localhost:8080/bank/balance/123456
    public ResponseEntity<Double> checkBalance(@PathVariable String acNum) {
        return ResponseEntity.ok(service.checkBalance(acNum));
    }
}
