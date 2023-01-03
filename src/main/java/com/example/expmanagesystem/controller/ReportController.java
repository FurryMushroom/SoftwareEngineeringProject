package com.example.expmanagesystem.controller;

import com.example.expmanagesystem.mapper.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.expmanagesystem.entity.Report;
@RestController
public class ReportController {
@Autowired
private ReportMapper reportMapper;
    @GetMapping("/getContent")
    public byte[] getContent(int reportid){
Report report= reportMapper.selectById(reportid);
        return report.getContent();
    }
    @PostMapping("/postReport")
    public String postReport(byte[] newContent,String userid,int projectid){
        Report newReport=new Report();
        newReport.setContent(newContent);
        newReport.setProjectid(projectid);
        newReport.setUserid(userid);
        int i=reportMapper.insert(newReport);
        if(i>0)return"插入成功";
        else return"插入失败";
    }
    @PostMapping("/gradeProject")
    public String gradeProject(String reportid,int score){
        Report newReport=new Report();
        newReport=reportMapper.selectById(reportid);
        newReport.setScore(score);
        int i=reportMapper.updateById(newReport);
        if(i>0)return"评分成功";
        else return"评分失败";
    }
}
