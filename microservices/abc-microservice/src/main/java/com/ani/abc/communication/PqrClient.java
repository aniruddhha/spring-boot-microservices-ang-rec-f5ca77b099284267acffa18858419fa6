package com.ani.abc.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "pqr", url = "http://pqr")
public interface PqrClient {

    @GetMapping("/")
    public String getPqr();
}
