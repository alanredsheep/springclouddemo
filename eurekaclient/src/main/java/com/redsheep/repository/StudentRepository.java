package com.redsheep.repository;

import com.redsheep.entity.Student;

import java.util.Collection;

/**
 * @author redsheep
 * @date 2019/7/23
 */

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
