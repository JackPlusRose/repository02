package com.cslg.service;

import com.cslg.domain.Account;

import java.util.List;

public interface IAccountService {
    public abstract List<Account> findAll();
    public abstract void saveAccount(Account account);
}
