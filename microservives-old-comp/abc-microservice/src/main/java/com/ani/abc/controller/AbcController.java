package com.ani.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {

    @GetMapping
    public String sayAbc() {
        return "I am Abc";
    }
}
