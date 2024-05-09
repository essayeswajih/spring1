package com.ecommerce.microcommerce1.Controller;

import com.ecommerce.microcommerce1.Entity.Student;
import com.ecommerce.microcommerce1.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService ;

    @GetMapping(value="/getStudents")
    public List<Student> GetStudents(){
        return studentService.getAllStudents();
    }
}
