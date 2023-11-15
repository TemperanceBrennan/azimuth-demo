package com.azimutexample.demoazimut.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> listOfStudents(){

        return List.of(
                new Student("Connor, John", LocalDate.of(1985, Month.FEBRUARY, 28)),
                new Student("Connor, Sarah", LocalDate.of(1965, Month.JANUARY, 1))
        );
    }

    public void add(Student student) {
        System.out.println(student);
    }
}
