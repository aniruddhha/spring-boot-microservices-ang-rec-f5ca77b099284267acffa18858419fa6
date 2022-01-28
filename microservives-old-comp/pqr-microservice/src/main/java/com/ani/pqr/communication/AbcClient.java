package com.ani.pqr.communication;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "abc", fallback = AbcFallback.class)
public interface AbcClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String abc();
}
