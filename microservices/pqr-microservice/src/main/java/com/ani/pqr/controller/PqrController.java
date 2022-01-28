package com.ani.pqr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PqrController {

    @Autowired
    private RestTemplate template;

    @GetMapping
    public ResponseEntity<String> sayPqr() {
        return ResponseEntity.ok("Say Pqr");
    }

    @GetMapping("/abc")
    public ResponseEntity<String> callAbc() {
        ResponseEntity<String> res = template.getForEntity("lb://ABC/", String.class);
        return res;
    }
}
