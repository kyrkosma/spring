package gr.kyrkosma.spring.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_annotations.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println("Patient's id: " + patient.getId());
        context.registerShutdownHook();
    }
}
