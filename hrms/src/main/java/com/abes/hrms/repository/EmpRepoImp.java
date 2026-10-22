package com.abes.hrms.repository;

import org.springframework.stereotype.Component;

@Component
public class EmpRepoImp implements EmpRepo {

    @Override
    public double squareRoot(double d) {
        return Math.sqrt(d);
    }

    @Override
    public String empData() {
        return "Employee ID: 101, Name: Rahul, Department: IT";
    }

    @Override
    public int add(int a,int b) {
        return a+b;
    }

    @Override
    public int gtn(int a,int b){
        if(a>b) return a;
        else return b;
    }


}