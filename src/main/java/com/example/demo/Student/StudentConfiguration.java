package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Mariam = new Student(
                    3L,
                    "Mariam",
                    "01707116665",
                    "mariammmm@gmail.com",
                    "CSE",
                    "9000",
                    LocalDate.of(2019, Month.JANUARY, 01)
            );
            studentRepository.save(Mariam);
            Student Farah = new Student(
                    4L,
                    "Farah",
                    "01707116665",
                    "farah@gmail.com",
                    "CSE",
                    "9000",
                    LocalDate.of(2019, Month.JANUARY, 01)
            );
            studentRepository.save(Farah);

        };
    }
}
