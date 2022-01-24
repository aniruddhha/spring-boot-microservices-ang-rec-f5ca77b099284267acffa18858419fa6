package com.ani.simple.controller;

import com.ani.simple.service.BankUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankUserController {

    @Autowired
    private BankUserService service;

    @Autowired
    private String myName;

}
