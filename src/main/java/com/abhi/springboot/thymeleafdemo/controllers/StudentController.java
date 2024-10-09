package com.abhi.springboot.thymeleafdemo.controllers;

import com.abhi.springboot.thymeleafdemo.models.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel ){

        // create a student object

        Student theStudent = new Student();

        // add student object to the model attribute
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent : " + theStudent.getFirstName() + " "
        + theStudent.getLastName());

        return "student-confirmation" ;
    }
}
