package com.ani.abc.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PQR")
public interface PqrClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getPqr();
}
