package com.redsheep.controller;

import com.redsheep.entity.Student;
import com.redsheep.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author redsheep
 * @date 2019/7/24
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @RequestMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @RequestMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
