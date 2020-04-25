package hello;

import org.springframework.stereotype.Component;

/**
 * 打印服务
 */
@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService....");
    }

    public String getMessage(){
        return "Hello World";
    }
}
