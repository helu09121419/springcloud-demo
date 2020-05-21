package com.ithl.eurekaservicefeignapi.service.serviceImp;

import com.ithl.eurekaservicefeignapi.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello-----"+name;
    }
}
