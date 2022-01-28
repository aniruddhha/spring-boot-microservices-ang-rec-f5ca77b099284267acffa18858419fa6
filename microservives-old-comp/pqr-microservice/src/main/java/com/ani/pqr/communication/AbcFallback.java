package com.ani.pqr.communication;

import org.springframework.stereotype.Component;

@Component
public class AbcFallback implements AbcClient{
    @Override
    public String abc() {
        return "might be Abc Microservice is Not Running, but your okay.";
    }
}
