package com.abhi.springboot.thymeleafdemo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form :
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form" ;
    }

    // need a controller method to process the HTML form :
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld-process" ;
    }

    // need a controller method to read form data and
    // add data to the model.
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from tht HTML form

        String theName = request.getParameter("studentName");

        // convert the name in Upper case

        theName = theName.toUpperCase() ;

        String result = "Yo !" + theName ;

        // add the message to the model

        model.addAttribute("message", result) ;
        return "helloworld-2";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDudeVersionTwo(@RequestParam("studentName") String name, Model model){
        name = name.toUpperCase() ;
        model.addAttribute("message", name ) ;
        return "helloworld-2" ;
    }
}
