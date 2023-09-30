package gr.kyrkosma.spring.innerbeans;

import gr.kyrkosma.spring.dependencycheck.Prescription;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("innerbeans.xml");
        Employee employeeSingleton1 = (Employee) context.getBean("employee");
        Employee employeeSingleton2 = (Employee) context.getBean("employee");
        System.out.println(employeeSingleton1.hashCode() + " | " + employeeSingleton1);
        System.out.println(employeeSingleton2.hashCode() + " | " + employeeSingleton2);

        Employee employeePrototype1 = (Employee) context.getBean("employee2");
        Employee employeePrototype2 = (Employee) context.getBean("employee2");
        System.out.println(employeePrototype1.hashCode() + "  | " + employeePrototype1);
        System.out.println(employeePrototype2.hashCode() + "  | " + employeePrototype2);

    }
}