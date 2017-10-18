package org.shunly.application.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.shunly.application.entity.Application;
import org.shunly.application.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    private Logger logger = LogManager.getLogger(ApplicationController.class.getName());

    @Autowired
    private ApplicationService applicationService;

    /**
     * 根据id查询
     * @param id id
     * @param model model
     * @return get
     */
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public @ResponseBody String id(@PathVariable int id, Model model){
        Application application = applicationService.getById(id);
        logger.info("id查询:"+ application);
        model.addAttribute("get", application);
        return  "get";
    }

    /**
     * 根据姓名查询
     * @param name 名字
     * @param model model
     * @return get
     */
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public String name(@PathVariable String name,Model model){
        Application application = applicationService.getByName(name);
        logger.info("姓名查询：" + application);
        model.addAttribute("get",application);
        return "get";
    }

    /**
     * 显示所有申请信息
     * @param model 1
     * @param httpServletRequest 1
     * @return list
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest httpServletRequest){
        List<Application> list = applicationService.listApplication();
        logger.info("List哟~：" + list);
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 以json的格式返回所有申请信息
     * @return
     */
    @RequestMapping(value = "/list2", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> list2(){
        List<Application> applications = applicationService.listApplication();
        for(Application a: applications){
            System.out.println(a);
            logger.info("json返回方式的：" + a);
        }
        Map<String, Object> map = new HashMap<String, Object>(2);
        map.put("list2",applications);
        return map;
    }

    /**
     * 根据id删除信息
     * @param id id
     * @param model 1
     * @return delete
     */
    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id, Model model){
       applicationService.delete(id);
       logger.info("id删除");
        return "delete";
    }

    /**
     * 添加
     * @param application a
     * @return add
     */
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String add(Application application){
        applicationService.insert(application);
        logger.info("添加信息");
        return  "add";
    }
}
