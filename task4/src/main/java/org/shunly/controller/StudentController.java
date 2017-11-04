package org.shunly.controller;


import org.shunly.service.JobService;
import org.shunly.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    JobService jobService;

    @RequestMapping(value = "/t10", method = RequestMethod.GET)
    public String t10(Model model){

       model.addAttribute("cC",studentService.countCompletion());
       model.addAttribute("cA",studentService.countAll());
       model.addAttribute("list",studentService.listCompletion());

       return "t10" ;
    }

    @RequestMapping(value = "/t11", method = RequestMethod.GET)
    public String t11(Model model){

        //front为前端的职业模型，end为后端的职业模型
        model.addAttribute("front",jobService.listJob(1));

        model.addAttribute("end",jobService.listJob(2));

        return "t11";
    }



}
