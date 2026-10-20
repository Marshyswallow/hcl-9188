package in.SpringCore.constructorDi.Employee;


import org.springframework.context.annotation.Bean;

import java.beans.DefaultPersistenceDelegate;

public class AppConfig {
    @Bean
    public Address address(){
        return new Address();
    }

    @Bean
    public Salary salary(){
        Salary salary = new Salary();
        salary.setBasic(3000);
        salary.setDa(5000);
        salary.setHra(6000);
        return salary;
    }

    @Bean
    public Department department(){
        return new Department();
    }

    @Bean
    public Employee employee(Address address,Salary salary,Department department){
        return new Employee(address,salary,department);
    }

}
