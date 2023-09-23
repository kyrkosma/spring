package gr.kyrkosma.spring.lifecycle.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setter method!");
        this.id = id;
    }

    @PostConstruct
    public void greet(){
        System.out.println("Hi! - [we are inside greet method]");
    }

    @PreDestroy
    public void bye(){
        System.out.println("Bye! - [we are inside bye method]");
    }
}
