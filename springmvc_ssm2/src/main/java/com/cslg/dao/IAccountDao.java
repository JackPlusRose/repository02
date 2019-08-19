package com.cslg.dao;

import com.cslg.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface IAccountDao {
    @Select("select * from account")
    public abstract List<Account> findAll();
    @Select("insert into account(userName,money) values(#{userName},#{money})")
    public abstract void saveAccount(Account account);
}
