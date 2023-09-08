package com.softeon.cms.service;

import com.softeon.cms.model.Student;

public class StudentServiceImpl implements StudentService{

    @Override
    public Student getStudentDetails(String id) {
        Student student=new Student();

       // student =get from db

        return student;
    }
}
