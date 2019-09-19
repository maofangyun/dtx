package com.dtx.trans.spring;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @version 1.0
 **/
@Component
public class Bank1ClientFallback implements Bank1Client {


    @Override
    public String transfer(String accountNo, Double amount) {
        return "fallback";
    }
}
