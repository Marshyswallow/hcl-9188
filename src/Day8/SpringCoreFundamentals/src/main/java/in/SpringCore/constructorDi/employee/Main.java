package in.SpringCore.constructorDi.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static  void main(String[] args){
        ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee=ctx.getBean(Employee.class);

        employee.getAddress();
        employee.getSalary();
        employee.getDepartment();
    }
}
