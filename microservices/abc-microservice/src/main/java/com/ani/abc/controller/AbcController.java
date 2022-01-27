package com.ani.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AbcController {

    @Autowired // I recommend
    private Environment env;

    @Value("${some-data}")
    private String someData;

    @GetMapping
    public ResponseEntity<String> sayAbc() {
        return ResponseEntity.ok("Say Abc = "+env.getProperty("some-data") + " - " +someData);
    }
}
