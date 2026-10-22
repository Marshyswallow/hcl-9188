package com.abes.hrms.model;


import com.abes.hrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {

    @Autowired
    private EmpRepoImp empRepo;

    public double squareRoot(double d){
        return empRepo.squareRoot(d);
    }
    public int add(){
        return empRepo.add(20,30);
    }

    public int gtn(){
        return empRepo.gtn(20,40);
    }


}
