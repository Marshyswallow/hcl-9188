package com.abes.hclhrms.repository;

import com.abes.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {

    String addemp(Employee emp);
    List<Employee> getEmp();
    String addEmpBulk(List<Employee> bulk);
    Employee getEmpById(long empid);
    String deleteById(long empid);
    String updateById(long empid,String updatedEmail);
}
