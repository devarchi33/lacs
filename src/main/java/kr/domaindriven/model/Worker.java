package kr.domaindriven.model;

/**
 * Created by donghoon on 2016. 5. 19..
 * 이 클래스는 작업별 작업 진행자를 나타냄
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
