package com.softeon.cms.service;

import com.softeon.cms.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public Student getStudentDetails(String id) {
        Student student = new Student();
        student.setId(id);
        student.setName("TEst01");
        student.setDept("CSE");
        student.setYear("2");
        // student =get from db

        return student;
    }
}
