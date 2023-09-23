package gr.kyrkosma.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("set.xml");
        CarDealer carDealer = (CarDealer) context.getBean("carDealer");
        System.out.println(carDealer.getName() + " " + carDealer.getBrands());
    }
}
