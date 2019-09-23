package com.dtx.trans.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator.
 */
@FeignClient(value="seata-demo-bank1")
public interface Bank1Client {
    @GetMapping("/bank1/transfer")
    public  String transfer(@RequestParam("accountNo")String accountNo, @RequestParam("amount") Double amount);
}
