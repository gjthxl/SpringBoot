package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/h")
public class HelloWorldAction {

    @RequestMapping("/m")
    @ResponseBody
    public String method(){
        return "redirect:/index.jsp";
    }
}
