package in.SpringCore;

import in.SpringCore.constructorDi.Employee.AppConfig;
import in.SpringCore.constructorDi.Employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee=ctx.getBean(Employee.class);

        employee.getAddress();
        employee.getSalary();
        employee.getDepartment();
    }
}
