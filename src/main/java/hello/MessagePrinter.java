package hello;

import hello.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 打印机
 */
@Component
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter...");
    }

    MessageService messageService;
    //

    
    public void setMessageService(MessageService messageService) {
        System.out.println("你是ddd大宝eee贝吗？");
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}
