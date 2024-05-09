package com.ecommerce.microcommerce1.Service;

import com.ecommerce.microcommerce1.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service

public class StudentService {
    public List<Student> getAllStudents(){
        return Arrays.asList(
                new Student("Wajih",21),
                new Student("Salah",20)
        );
    }
}
