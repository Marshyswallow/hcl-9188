package com.abes.hclhrms;

import com.abes.hclhrms.entity.Employee;
import com.abes.hclhrms.repository.EmployeeRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImp {

    @Autowired
    private EmployeeRepoImp emprepo;

    public String addEmp(){
        Employee emp1=new Employee(101, "Rahul Sharma", "Software Engineer", "Java, Spring Boot, MySQL",
                "rahul.sharma@example.com");

        return emprepo.addemp(emp1);
    }


    public List<Employee> getEmp(){
        return emprepo.getEmp();
    }

    public Employee getEmpById(){
        return emprepo.getEmpById(101);
    }



    public String addEmpBulk(){
        List<Employee> empList2 = new ArrayList<>();
        empList2.add(new Employee(102, "Priya Verma", "Frontend Developer","React, JavaScript", "priya@example.com"
        ));
        empList2.add(new Employee(
                103, "Amit Kumar", "Backend Developer",
                "Java, MySQL", "amit@example.com"
        ));
        empList2.add(new Employee(
                104, "Neha Singh", "Data Analyst",
                "Python, SQL", "neha@example.com"
        ));
        empList2.add(new Employee(
                105, "Arjun Patel", "Full Stack Developer",
                "Java, React, MongoDB", "arjun@example.com"
        ));

        return emprepo.addEmpBulk(empList2);
    }

    public String updateEmpListById(){
        return emprepo.updateById(101,"vikram@example.com");
    }

    public String deleteEmployee(){
        return emprepo.deleteById(108);
    }
}
