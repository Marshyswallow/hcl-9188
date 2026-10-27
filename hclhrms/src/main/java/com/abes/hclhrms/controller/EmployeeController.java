package com.abes.hclhrms.controller;

import com.abes.hclhrms.EmployeeServiceImp;
import com.abes.hclhrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @GetMapping("/")
    public String welcomeMsg(){
        return "welcome to abes hrms";
    }

    @GetMapping("/addemp")
    public String addnewEmployee(){
        return employeeServiceImp.addEmp();
    }

    @GetMapping("/getemp")
    public List<Employee> getEmployee(){
        return employeeServiceImp.getEmp();
    }

    @GetMapping("/getempid")
    public Employee getEmployeeById(){
        return employeeServiceImp.getEmpById();
    }

    @GetMapping("/addbulk")
    public String addEmpBulk(){
        return employeeServiceImp.addEmpBulk();
    }

    @PatchMapping("/updatebyid")
    public String updateEmpById(){
        return employeeServiceImp.updateEmpListById();
    }

    @GetMapping("/deleteemp")
    public String deleteById(){
        return employeeServiceImp.deleteEmployee();
    }
}
