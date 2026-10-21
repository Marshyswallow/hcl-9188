package in.SpringCore.notificationService;


import org.springframework.stereotype.Component;

@Component
public class whatsappService implements  NotificationService{
    @Override
    public void sendMessage(String msg){
        System.out.println("Whatsapp notification: "+msg);
    }

}
