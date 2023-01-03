package com.example.expmanagesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.expmanagesystem.entity.Course;
import com.example.expmanagesystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
@Select("select * from coursestudents where courseid=#{courseid}")
    User selectById(int courseid);

}
