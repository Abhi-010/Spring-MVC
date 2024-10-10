package com.abhi.springboot.thymeleafdemo.controllers;

import com.abhi.springboot.thymeleafdemo.models.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    List<String> countries;

    @Value("${languages}")
    List<String> languages ;

    @Value("${operatingSystem}")
    List<String> operatingSystem ;

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel ){

        // create a student object

        Student theStudent = new Student();

        // add student object to the model attribute
        theModel.addAttribute("student", theStudent);

        // add the list of countries to the model

        theModel.addAttribute("countries", countries) ;

        // add the list of programming languages in the model

        theModel.addAttribute("languages", languages) ;

        // add the list of operating system in the model

        theModel.addAttribute("operatingSystem", operatingSystem);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent : " + theStudent.getFirstName() + " "
        + theStudent.getLastName() + theStudent.getCountry()
        + theStudent.getFavoriteProgrammingLanguage());

        return "student-confirmation" ;
    }
}
