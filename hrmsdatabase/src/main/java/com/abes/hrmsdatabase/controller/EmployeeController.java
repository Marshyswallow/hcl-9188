package com.abes.hrmsdatabase.controller;

import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String msg(){
        return "Hrms is online";
    }

    @GetMapping("/addemp")
    public String addEmp(){
        return employeeService.createnewEmployee();
    }

    @GetMapping("findbyid/{empid}")
    public Employee getEmpById(@PathVariable long empid){
        System.out.println("Employee id:"+empid);
    return employeeService.getEmpById(empid);
    }

    @DeleteMapping("deletebyid/{empid}")
    public String deleteById(@PathVariable long empid){
        return employeeService.deleteById(empid);
    }
}
