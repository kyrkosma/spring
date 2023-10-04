package gr.kyrkosma.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configs/list.xml");
        Employee emp = (Employee) context.getBean("emp");
        Company hos = (Company) context.getBean("hospital");
        System.out.println(emp.getId() + " " + emp.getName());
        System.out.println(hos.getName() + " " + hos.getDepartments());
    }
}
