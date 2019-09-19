package com.dtx.trans.controller;

import com.dtx.trans.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
public class TransController {

    @Autowired
    TransService transService;

    //张三转账
    @GetMapping("/transfer")
    public String transfer(Double amount){
        transService.trans("1",amount);
        return "bank1转账"+amount;
    }
}
