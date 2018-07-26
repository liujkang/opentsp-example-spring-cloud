package com.mapbar.test02.impl;

import com.mapbar.test02.PersionInter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by liujk on 2017/8/1.
 */
@Service(value = "liujk")
public class LiujkImpl implements PersionInter{
    @Override
    public String name() {
        return "i am liujk";
    }

    @Override
    public void sysHello() {
        System.out.println("i am liujk");
    }
}
