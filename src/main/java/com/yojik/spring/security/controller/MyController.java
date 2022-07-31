package com.yojik.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class MyController {



    @GetMapping("/")
    public String getInfoForAllEmps(){
    return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHr(){
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view_for_managers";
    }
}
