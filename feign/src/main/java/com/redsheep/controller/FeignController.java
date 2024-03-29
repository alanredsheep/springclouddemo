package com.redsheep.controller;

import com.redsheep.entity.Student;
import com.redsheep.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author redsheep
 * @date 2019/7/24
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
