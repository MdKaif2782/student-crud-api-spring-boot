package com.example.demo.Student;

import javax.persistence.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

import static java.time.LocalTime.now;
import static java.util.Calendar.getInstance;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    private Long id;
    private String name;
    @Transient
    private int age;
    private String phone;
    private String email;
    private String course;
    private String fee;
    private LocalDate dob;


    public Student() {

    }

    public Student(long id,String name,
                   String phone,
                   String email,
                   String course,
                   String fee,
                   LocalDate dob) {
        this.id= id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
