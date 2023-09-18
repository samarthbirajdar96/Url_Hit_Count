package com.example.countHitApi.Entity;

public class UserHitCount {
    private String userName;
    private Integer counter;

    public UserHitCount(String userName, Integer counter) {
        this.userName = userName;
        this.counter = counter;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}

