package com.ani.pqr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PqrController {

    @GetMapping
    public String sayPqr() {
        return "I am Pqr";
    }
}
