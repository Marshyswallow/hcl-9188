package in.SpringCore.notificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements NotificationService {
    @Override
    public void sendMessage(String msg){
        System.out.println("Email service: "+msg);
    }
}
