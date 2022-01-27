package com.ani.abc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {

    @GetMapping
    public ResponseEntity<String> sayAbc() {
        return ResponseEntity.ok("Say Abc");
    }
}
