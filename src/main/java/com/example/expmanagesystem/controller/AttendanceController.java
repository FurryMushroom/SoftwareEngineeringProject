package com.example.expmanagesystem.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.expmanagesystem.entity.Attendance;
import com.example.expmanagesystem.mapper.AttendanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    @Autowired
    AttendanceMapper attendanceMapper;
    @PostMapping("/changeAttendanceTimes")
    public String changeAttendanceTimes(String userid,String courseid,int times){
        QueryWrapper<Attendance> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("userid",userid);
        queryWrapper.eq("courseid",courseid);
        Attendance newAttendance=new Attendance();newAttendance.setUserid(userid);
        newAttendance.setTimes(times);newAttendance.setCourseid(courseid);
        int i=attendanceMapper.update(newAttendance,queryWrapper);
        if(i>0)return"修改成功";
        else return"修改失败";
    }
}
