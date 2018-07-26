package com.mapbar.example.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 错误处理，当远程调用失败时调用此方法
 */
@Component
public class FeignClientImpl implements FeignClientInter {

    @Override
    public String helloService(@RequestParam(value = "name") String name) {

        return "sorry "+name+" feign, is error!";
    }


}
