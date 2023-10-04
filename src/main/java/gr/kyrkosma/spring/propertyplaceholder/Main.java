package gr.kyrkosma.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/propertyplaceholder.xml");
        MyDAO myDAO = (MyDAO) context.getBean("myDAO");
        System.out.println(myDAO);
    }
}