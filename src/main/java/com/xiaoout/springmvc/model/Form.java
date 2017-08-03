package com.xiaoout.springmvc.model;

/**
 * Created by cchen17 on 7/24/2017.
 */
public class Form {

    private String name;
    private String age;
    private boolean receivePaper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isReceivePaper() {
        return receivePaper;
    }
    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }
}
