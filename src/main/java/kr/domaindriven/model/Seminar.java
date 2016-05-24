package kr.domaindriven.model;

import java.util.List;

/**
 * Created by donghoon on 2016. 5. 19..
 * 이 클래스는 세미나를 위해 만들었으며, 각 세미나는 하나 이상의 task 를 가지고 있음.
 */
public class Seminar {

    private long id;
    private String name;
    private String state = "NOW";
    private List<Task> tasks;

    public Seminar(long id, String name, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
