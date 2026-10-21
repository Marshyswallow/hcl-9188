package in.SpringCore.fieldDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp1 = ctx.getBean(Employee.class);
        emp1.displayAddress();
        ctx.close();
    }
}