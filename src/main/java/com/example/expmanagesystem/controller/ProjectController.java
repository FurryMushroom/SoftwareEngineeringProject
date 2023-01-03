package com.example.expmanagesystem.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.expmanagesystem.entity.Project;
import com.example.expmanagesystem.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ProjectController {
    @Autowired
    private ProjectMapper projectMapper;
    @PostMapping("/createProject")
        public String createProject(Project newPro){
            int i=projectMapper.insert(newPro);
            if(i>0)return"插入成功！";
            else return "插入失败！";
        }
    @PostMapping("/editProject")
    public String editProject(Project Pro){
        int i=projectMapper.updateById(Pro);
        if(i>0)return"更新成功！";
        else return "更新失败！";
    }
    @PostMapping("/openProject")
    public String openProject(int projectid){
        Project newPro=new Project();
        newPro=projectMapper.selectById(projectid);
    newPro.setStatus(1);
        int i=projectMapper.updateById(newPro);
        if(i>0)return"更新成功！";
        else return "更新失败！";
    }
@GetMapping("/getProjectList")
    public List getProjectList(String userid,String userType){
    QueryWrapper<Project> queryWrapperForStudent=new QueryWrapper<>();
    queryWrapperForStudent.eq("status",1);
    QueryWrapper<Project> queryWrapperForTeacher=new QueryWrapper<>();
    queryWrapperForTeacher.eq("userid",userid);
        List<Project> list;
        if(userType=="student")
        list=projectMapper.selectList(queryWrapperForStudent);
        else if(userType=="teacher")
            list=projectMapper.selectList(queryWrapperForTeacher);
        else
            list=projectMapper.selectList(null);
        return list;
}

}
