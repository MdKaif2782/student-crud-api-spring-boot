package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private String phone;
    private String email;
    private String course;
    private String fee;
    private LocalDate dob;

    public Student() {

    }

    public Student(String name,
                   int age,
                   String phone,
                   String email,
                   String course,
                   String fee,
                   LocalDate dob) {
        this.name = name;
        this.age = age;
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
        return age;
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
}
