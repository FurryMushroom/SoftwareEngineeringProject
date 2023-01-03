package com.example.expmanagesystem.controller;
import com.example.expmanagesystem.entity.CourseStudents;
import com.example.expmanagesystem.mapper.CourseMapper;
import com.example.expmanagesystem.mapper.CourseStudentsMapper;
import com.example.expmanagesystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.expmanagesystem.entity.User;
import com.example.expmanagesystem.entity.Course;
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user")
    public List query(){
        List<User> list =userMapper.selectList(null);
        System.out.println(list);
        return list;
    }
    @PostMapping("/addUser")
    public String addUser(User newUser){
        int i=userMapper.insert(newUser);
        if(i>0)return"插入成功！";
        else return "插入失败！";
    }
    @Autowired
    private CourseMapper courseMapper;
    @PostMapping("/createCourse")
    public String createCourse(Course newCourse){
        int i=courseMapper.insert(newCourse);
        if(i>0)return"插入成功！";
        else return "插入失败！";
    }
    @PostMapping("/changeCourseInfo")
    public String changeCourseInfo(Course newCourse){

        int i=courseMapper.updateById(newCourse);
        if(i>0)return"更新成功！";
        else return "更新失败！";
    }
    @Autowired
    private CourseStudentsMapper courseStudentsMapper;
    @PostMapping("/courseAddStudents")
    public String courseAddStudents(CourseStudents newStudent){
        int i=courseStudentsMapper.insert(newStudent);
        if(i>0)return"插入成功！";
        else return "插入失败！";
    }

}
