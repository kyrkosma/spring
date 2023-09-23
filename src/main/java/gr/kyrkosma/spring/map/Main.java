package gr.kyrkosma.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("map.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " : " + customer.getProducts());
    }
}
