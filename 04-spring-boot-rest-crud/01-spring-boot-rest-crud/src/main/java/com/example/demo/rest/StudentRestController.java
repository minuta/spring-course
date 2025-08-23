package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    
    private List<Student> students;

    // define @PostConstruct to load the student data
    @PostConstruct
    public void init(){
        students = new ArrayList<>();

        students.add(new Student("Maria", "Grant"));
        students.add(new Student("Anna", "Black"));
        students.add(new Student("Jack", "Hardy"));
    }

    // define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        return students.get(id);
    }
}
