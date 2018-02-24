package com.example.serviceInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2018/2/24.
 */
@FeignClient(name= "service-one")
public interface ModuleOneInterface {

    @RequestMapping(value = "/moduleOne/showName")
    public String showName();

}
