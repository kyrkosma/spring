package gr.kyrkosma.spring.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("[inside setter method]");
        this.id = id;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("[inside after properties set]");
    }

    @Override
    public void destroy() {
        System.out.println("[inside destroy()]");
    }
}
