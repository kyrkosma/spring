package gr.kyrkosma.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/constructorinjection.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        Employee employee123 = (Employee) context.getBean("employee123");
        System.out.println(employee123);
    }
}