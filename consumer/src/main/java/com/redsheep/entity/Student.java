package com.redsheep.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author redsheep
 * @date 2019/7/23
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private long id;
    private String name;
    private int age;
}
