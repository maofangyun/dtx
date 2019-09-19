package com.dtx.trans.service;

import com.dtx.trans.spring.Bank1Client;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransService {

    @Autowired
    Bank1Client bank1Client;

    @GlobalTransactional//开启全局事务
    public void trans(String accountNo, Double amount){
        bank1Client.transfer(accountNo,amount);
    }

}
