package com.azimutexample.demoazimut.students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping(path = "list")
    public List<Student> listOfStudents(){

        return studentService.listOfStudents();
    }

    @PostMapping(path = "item")
    public void add(@RequestBody Student student){
        studentService.add(student);
    }

}
