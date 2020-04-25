package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("applicationSpring");
        /**
         * 初始化spring容器
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        /*从容器中获取对象*/
        //MessageService messageService = context.getBean(MessageService.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        //System.out.println(messageService);
        System.out.println(messagePrinter);
        //messagePrinter.setMessageService(messageService);
        messagePrinter.printMessage();
    }
}
