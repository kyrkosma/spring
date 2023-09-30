package gr.kyrkosma.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("dependencycheck.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println(prescription);
    }
}