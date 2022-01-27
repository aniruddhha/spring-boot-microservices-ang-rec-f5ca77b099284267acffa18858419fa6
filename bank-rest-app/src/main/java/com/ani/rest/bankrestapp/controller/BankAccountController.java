package com.ani.rest.bankrestapp.controller;

import com.ani.rest.bankrestapp.domain.BankAccount;
import com.ani.rest.bankrestapp.dto.AppRes;
import com.ani.rest.bankrestapp.dto.BankAccountDto;
import com.ani.rest.bankrestapp.dto.NameBalanceDto;
import com.ani.rest.bankrestapp.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bank")
@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @PostMapping // POST -> http://localhost:8080/bank/
    public ResponseEntity<AppRes<Integer>> createBankAccount(@RequestBody BankAccountDto dto) {

        int op = service.createNewAccount(dto);
        AppRes<Integer> res = new AppRes<>();
        res.setRes(op);
        res.setMsg("Saved Successfully");
        res.setSts("success");

        return new ResponseEntity<>( res, HttpStatus.CREATED);
    }

    @GetMapping("/balance/{acNum}") // GET -> http://localhost:8080/bank/balance/123456
    public ResponseEntity<Double> checkBalance(@PathVariable String acNum) {
        return ResponseEntity.ok(service.checkBalance(acNum));
    }

    @GetMapping("/nmbal/{acNum}")
    public ResponseEntity<NameBalanceDto> getNameBalance(@PathVariable String acNum) {
        return ResponseEntity.ok(service.findNameBalance(acNum));
    }
}
