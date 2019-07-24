package com.redsheep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author redsheep
 * @date 2019/7/23
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplicaiton.class, args);
    }
}
