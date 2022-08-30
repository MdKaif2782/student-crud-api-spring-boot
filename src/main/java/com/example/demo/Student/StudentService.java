package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(new Student("Md Kaif Ibn Zaman",18,"01521345678","mibnzaman02@gmail.com","Java","500", LocalDate.of(2004, Month.APRIL,25)));
    }
}
