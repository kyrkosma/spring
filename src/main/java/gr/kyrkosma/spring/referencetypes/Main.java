package gr.kyrkosma.spring.referencetypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referencetypes.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Maths: " + student.getScores().getMaths());
        System.out.println("Ancient Greek: " + student.getScores().getAncientGreek());
    }
}
