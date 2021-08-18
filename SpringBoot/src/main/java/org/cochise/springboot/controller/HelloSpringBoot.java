package org.cochise.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String hello(Model model){
      return "hello";
    }
}
