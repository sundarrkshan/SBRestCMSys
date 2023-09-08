package com.softeon.cms.controller;

import com.softeon.cms.model.Student;
import com.softeon.cms.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController


public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger= LogManager.getLogger(StudentController.class);

    @PostMapping(value = "rest/api/v1/getdetails/{id}")
    public @ResponseBody Student getStudentListPath(@PathVariable String id) {
        Student student = new Student();
        student = studentService.getStudentDetails(id);
        logger.info("Student details : "+ student);
        return student;
    }


    @PostMapping(value = "rest/api/v1/getdetails")
    public @ResponseBody Student getStudentListParam(@RequestParam("id") String id) {
        Student student = new Student();
        student=studentService.getStudentDetails(id);
        logger.info("Student details : "+ student);

        return student;
    }
}

