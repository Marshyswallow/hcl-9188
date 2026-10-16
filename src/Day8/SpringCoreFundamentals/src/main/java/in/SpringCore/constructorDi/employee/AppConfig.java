package in.SpringCore.constructorDi.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address(){
        return new Address();
    }

    @Bean
    public Salary salary() {
        Salary salary = new Salary();
        salary.setBasic(30000);
        salary.setDa(6000);
        salary.setHra(3000);
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
