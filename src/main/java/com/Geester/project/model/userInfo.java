package com.Geester.project.model;

import org.springframework.stereotype.Component;

@Component
public class userInfo {
    private  int count = 0;

    public  int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
