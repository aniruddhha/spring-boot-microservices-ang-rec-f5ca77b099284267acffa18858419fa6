package com.ani.rest.bankrestapp.controller;

import com.ani.rest.bankrestapp.domain.BankUser;
import com.ani.rest.bankrestapp.service.BankUserService;
import com.ani.rest.bankrestapp.service.BankUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/user")
@RestController
public class BankUserController {

    @Autowired // why we auto wire interface reference ?
    private BankUserService service;

    @GetMapping("/sample") // http://localhost:8080/user/sample -> GET
    public ResponseEntity<BankUser> sampleUserObject() {

        BankUser user = new BankUser(
                1L,
                "abc",
                "12jdfkkf",
                LocalDate.now()
        );

        ResponseEntity<BankUser> entity =
                new ResponseEntity<BankUser>(user, HttpStatus.OK);

        return entity;
    }

    @PostMapping // http://localhost:8080/user/ -> POST
    public @ResponseBody ResponseEntity<BankUser> createNewUser(@RequestBody BankUser user) { // json -> java
        BankUser svUsr = service.saveBankUser(user);
        // response -> java to json
        return new ResponseEntity<>(svUsr, HttpStatus.CREATED);
    }

    @GetMapping("/name/{nm}")
    public ResponseEntity<List<BankUser>> searchByName(@PathVariable String nm) {
        return ResponseEntity.ok(service.searchAllUsers(nm));
    }

    @GetMapping("/number/{num}")
    public ResponseEntity<List<BankUser>> searchByNumber(@PathVariable String num) {
        return ResponseEntity.ok(service.searchByAcNum(num));
    }

    @GetMapping
    public ResponseEntity<List<BankUser>> searchAllUsers() {
        return ResponseEntity.ok(service.findAllUsers());
    }

    @PutMapping("/{id}/{nm}")
    public ResponseEntity<Integer> updateBankUserName(@PathVariable Long id, @PathVariable("nm") String njgjgm) {
        return ResponseEntity.ok(service.updateUserName(id, njgjgm));
    }
}
