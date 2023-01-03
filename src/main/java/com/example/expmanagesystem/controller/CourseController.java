package com.example.expmanagesystem.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.expmanagesystem.entity.Course;
import com.example.expmanagesystem.entity.CourseStudents;
import com.example.expmanagesystem.mapper.CourseMapper;
import com.example.expmanagesystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.expmanagesystem.entity.User;
import com.example.expmanagesystem.mapper.CourseStudentsMapper;
@RestController
public class CourseController {
    @Autowired
    private CourseStudentsMapper courseStudentsMapper;
    @Autowired
    private UserMapper userMapper;
@GetMapping("/getCourseStudents")
    public List getCourseStudents(String courseid){
    List<String> users;
    List<User> list;
    users=courseStudentsMapper.selectByCourseid(courseid);
    return users;
}
@Autowired
private CourseMapper courseMapper;
    @GetMapping("/getCourses")
    public List getCourses(){
        List<Course> list =courseMapper.selectList(null);
        System.out.println(list);
        return list;
    }
}
