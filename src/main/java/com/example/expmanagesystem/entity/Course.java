package com.example.expmanagesystem.entity;
import com.baomidou.mybatisplus.annotation.TableId;

import java.beans.Transient;
import  java.util.List;
import com.baomidou.mybatisplus.annotation.IdType;

public class Course {
    @TableId(value="courseid",type=IdType.INPUT)
    private String courseid;
    public String coursename;
   public String courseinfo;

    public String userid;

    private transient List<User> students;
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseinfo() {
        return courseinfo;
    }

    public void setCourseinfo(String courseinfo) {
        this.courseinfo = courseinfo;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }
}
