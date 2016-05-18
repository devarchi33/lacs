package kr.domaindriven.model;

/**
 * Created by donghoon on 2016. 5. 19..
 */
public class Worker {

    private long id;
    private String name;

    public Worker(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
