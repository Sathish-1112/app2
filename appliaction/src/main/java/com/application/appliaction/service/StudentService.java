package com.application.appliaction.service;

import com.application.appliaction.model.Student;
import com.application.appliaction.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private Repository repo;

    public  List<Student> getAllStudents() {
        return repo.getallstudents();
    }
    public  Student getStudentsbyId(int id) {
        return repo.getStudentsbyId(id);
    }
    public  void addstudent(Student stu) {
         repo.addstudent(stu);
    }
    public  void updatestudent(Student stu) {
        repo.updatestudent(stu);
    }
    public  void deletestudent(int id) {
        repo.deletestudent(id);
    }



}
