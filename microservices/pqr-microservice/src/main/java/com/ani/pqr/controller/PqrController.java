package com.ani.pqr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PqrController {

    @GetMapping
    public ResponseEntity<String> sayPqr() {
        return ResponseEntity.ok("Say Pqr");
    }
}
