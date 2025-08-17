package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void init(){
        students = new ArrayList<>();

        students.add(new Student("Maria", "Grant"));
        students.add(new Student("Anna", "Black"));
        students.add(new Student("Jack", "Hardy"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {


        return students;
    }
}
