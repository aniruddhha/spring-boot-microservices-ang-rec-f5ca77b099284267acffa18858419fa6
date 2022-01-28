package com.ani.pqr.controller;

import com.ani.pqr.communication.AbcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PqrController {

    @Autowired
    private AbcClient client;

    @GetMapping
    public String sayPqr() {
        return "I am Pqr";
    }

    @GetMapping("/abc")
    public String callAbc() { return client.abc(); }
}
