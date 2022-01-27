package com.ani.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {

    @Autowired
    private Environment env;

    @GetMapping
    public ResponseEntity<String> sayAbc() {
        return ResponseEntity.ok("Say Abc = "+env.getProperty("some-data"));
    }
}
