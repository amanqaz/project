package com.Geester.project.service;

import com.Geester.project.model.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class services {
    @Autowired userInfo data;

    public int counter(){
      data.setCount(data.getCount()+1);
      return data.getCount();


    }
}
