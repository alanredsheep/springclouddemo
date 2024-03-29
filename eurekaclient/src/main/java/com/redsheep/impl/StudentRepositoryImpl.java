package com.redsheep.impl;

import com.redsheep.entity.Student;
import com.redsheep.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author redsheep
 * @date 2019/7/23
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三",12));
        studentMap.put(2l,new Student(2l,"李四",13));
        studentMap.put(3l,new Student(3l,"王五",14));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
