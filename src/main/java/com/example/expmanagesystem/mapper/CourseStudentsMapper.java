package com.example.expmanagesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.expmanagesystem.entity.Course;
import com.example.expmanagesystem.entity.CourseStudents;
import com.example.expmanagesystem.entity.User;
import org.apache.ibatis.annotations.*;

import  java.util.List;
@Mapper
public interface CourseStudentsMapper extends BaseMapper<CourseStudents> {
@Select("select * from course_students where courseid=#{courseid}")
 List<String>  selectByCourseid(String courseid);

/*@Select("select * from coursestudent")
    @Results({
            @Result(column = "userid",property = "userid"),
            @Result(column = "username",property = "username"),
            @Result(column = "email",property = "email"),
            @Result(column = "courseid",property = "courseid",javaType = Course.class,
            one =@One(select="com.example.expmanagesystem.mapper.CourseMapper.selectById")
             )
    })*/
}
