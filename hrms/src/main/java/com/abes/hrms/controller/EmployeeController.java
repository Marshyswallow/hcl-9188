package com.abes.hrms.controller;

import com.abes.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private DemoEmployee demoEmployee;

    @GetMapping("/")
    public String welcome() {
        return "<h1 style='color:red'>Welcome to the hrms App<h1>";
    }

    @GetMapping("/add")
    public int add(){
        System.out.println("api hitting");
        int result= demoEmployee.add();
        System.out.println("result from model="+result);
        return result;
    }

    @GetMapping("/sqrt")
    public double getquareRoot(){
        return demoEmployee.squareRoot(2000);
    }

    @GetMapping("/gtn")
    public int greaterNum(){
        return demoEmployee.gtn();
    }
}