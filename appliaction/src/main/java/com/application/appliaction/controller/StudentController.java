package com.application.appliaction.controller;

import com.application.appliaction.model.Student;
import com.application.appliaction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;
    @RequestMapping("/stu")
    public String hello(){
        return "heloo";
    }

    @GetMapping("/stu/liststudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>( service.getAllStudents(), HttpStatus.OK);
    }
    @GetMapping("/getstu/{id}")
    public Student getStudentsbyId(@PathVariable int id){
        return service.getStudentsbyId(id);
    }
    @PostMapping("/addstu")
    public void addstudent(@RequestBody Student stu){
        service.addstudent(stu);
    }
    @PutMapping("/updatestu")
    public void updatestudent(@RequestBody Student stu) {
        service.updatestudent(stu);

    }
    @DeleteMapping("del/{id}")
    public void deletestudent(@PathVariable int id, Student stu) {
        service.deletestudent(id);
    }

}
