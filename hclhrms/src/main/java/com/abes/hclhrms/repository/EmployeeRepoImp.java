package com.abes.hclhrms.repository;

import com.abes.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Locale.filter;

@Repository
public class EmployeeRepoImp implements EmployeeRepo{
    List<Employee> empList=new ArrayList<>();
    @Override
    public String addemp(Employee emp) {
        empList.add(emp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        if(empList.isEmpty()){
            System.out.println("List is empty");
        }
        return empList;
    }

    @Override
    public String addEmpBulk(List<Employee> BulkEmp) {
        empList.addAll(BulkEmp);
        return "Employee added in bulk successfully";
    }

    @Override
    public Employee getEmpById(long empid) {
       boolean exists=empList.stream().anyMatch(n->n.getEmp_id()==empid);
       if(exists){
           for(Employee i : empList){
               if(i.getEmp_id()==empid){
                   return i;
               }
           }
       }
       return null;
    }

    @Override
    public String deleteById(long empid) {
        Employee emp=empList.stream().filter(n->n.getEmp_id()==empid).findFirst().orElse(null);
        if(emp!=null){
        Iterator<Employee> it= empList.iterator();
        while(it.hasNext()){
            Employee em=it.next();
            if(em.getEmp_id()==empid){
                it.remove();
            }
        }
        return "Employee removed successfully";
        }
        return "Employee not fround with id"+empid;
    }

    @Override
    public String updateById(long empid, String updatedEmail) {
        Employee emp=getEmpById(empid);
        if(emp!=null){
            emp.setEmail(updatedEmail);
            return "employee updated successfully";
        }
        return "employee not found";
    }
}
