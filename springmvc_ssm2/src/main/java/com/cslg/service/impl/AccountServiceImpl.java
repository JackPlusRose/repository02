package com.cslg.service.impl;

import com.cslg.dao.IAccountDao;
import com.cslg.domain.Account;
import com.cslg.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    @Qualifier("accountDao")
    private IAccountDao iAccountDao=null;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有");
        List<Account> all = iAccountDao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        return all;
    }

    @Override
    public void saveAccount(Account account) {
        iAccountDao.saveAccount(account);
        System.out.println("业务层保存");
    }
}
