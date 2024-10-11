package com.abhi.springmvc.controllers;

import com.abhi.springmvc.models.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CustomerController {


    @GetMapping("/showCustomerForm")
    public String showCustomerForm(Model theModel){

        theModel.addAttribute("customer", new Customer()) ;

        return "customer-form" ;
    }

    @GetMapping("/processCustomerForm")
    public String processCustomerForm(
            @Valid @ModelAttribute("customer") Customer Customer,
            BindingResult theBindingResult){

        if(theBindingResult.hasErrors()){
            return "customer-form";
        }

        System.out.println(Customer.getFirstName() + " " + Customer.getLastName());

        return "customer-confirmation" ;
    }
}
