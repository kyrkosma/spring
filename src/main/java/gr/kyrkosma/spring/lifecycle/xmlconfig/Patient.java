package gr.kyrkosma.spring.lifecycle.xmlconfig;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setter method!");
        this.id = id;
    }

    public void greet(){
        System.out.println("Hi! - [we are inside greet method]");
    }

    public void bye(){
        System.out.println("Bye! - [we are inside bye method]");
    }
}
