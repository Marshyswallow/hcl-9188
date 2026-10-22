package in.SpringCore.notificationService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static  void main(String[] args){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Student student =ctx.getBean(Student.class);
        Student student1=ctx.getBean(Student.class);

        student.notifyStudent();

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        ((AnnotationConfigApplicationContext) ctx).close();

    }
}
