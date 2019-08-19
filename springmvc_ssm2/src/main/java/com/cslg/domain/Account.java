package com.cslg.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer aid;
    private String userName;
    private double money;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
