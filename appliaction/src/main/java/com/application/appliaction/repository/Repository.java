package com.application.appliaction.repository;

import com.application.appliaction.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    private  JdbcTemplate jt;


    private static RowMapper<Student> rowMapper = (rs, rowNum) -> {
        Student stu = new Student();
        stu.setId(rs.getInt("id"));
        stu.setName(rs.getString("name"));
        return stu;
    };


    public  List<Student> getallstudents() {
        return jt.query("select * from student",rowMapper);
    }
    public  Student getStudentsbyId(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        return jt.queryForObject(sql, new Object[]{id}, rowMapper);
    }

    public  int addstudent(Student stu) {
        String sql = "INSERT INTO student (id,name) VALUES (?, ?)";
        return jt.update(sql, stu.getId(),stu.getName());
    }

    public  int updatestudent(Student stu) {
        String sql = "UPDATE student SET name = ? WHERE id = ?";
        return jt.update(sql, stu.getName(),  stu.getId());
    }

    public  int deletestudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        return jt.update(sql, id);

    }

}
