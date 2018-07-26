package com.mapbar.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by liujk on 2017/8/1.
 */
@RestController
public class Test02Controller {

    @Autowired
    Map<String, PersionInter> persions;

    @RequestMapping("/persion")
    public String persion(String persion){

        if(!StringUtils.isEmpty(persion)){
            persions.get(persion).sysHello();
        }

        return persion;

    }
}
