package com.example.expmanagesystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.expmanagesystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
