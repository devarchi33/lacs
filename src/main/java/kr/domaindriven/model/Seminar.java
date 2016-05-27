package kr.domaindriven.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by donghoon on 2016. 5. 19..
 * Modified by donghoon on 2016. 5. 26..
 * <p/>
 * 이 클래스는 세미나를 위해 만들었으며, 각 세미나는 하나 이상의 task 를 가지고 있음.
 * MongoDB seminars collection 에 저장.
 */
@Document(collection = "seminars")
public class Seminar {

    @Id
    private long id;
    private String title;
    private String state = "NOW";
    private List<Task> tasks;

    public Seminar(long id, String title, List<Task> tasks) {
        this.id = id;
        this.title = title;
        this.tasks = tasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
