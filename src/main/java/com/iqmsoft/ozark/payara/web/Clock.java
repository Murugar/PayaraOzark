package com.iqmsoft.ozark.payara.web;


public class Clock {

    private String now;

    public Clock(String now) {
        this.now = now;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

}
