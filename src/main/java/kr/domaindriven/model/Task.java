package kr.domaindriven.model;

import java.util.List;

/**
 * Created by donghoon on 2016. 5. 19..
 * 이 클래스는 각 작업을 나타내기 위해 만들었음.
 * 각 작업은 하나 이상의 Worker를 포함하ㅅ
 */
public class Task {

    private long id;
    private String taskName;
    private List<Worker> workers;
    private int progress = 0;
    private boolean isCompleted = false;

    public Task(){}

    public Task(long id, String taskName, List<Worker> workers) {
        this.id = id;
        taskName = taskName;
        this.workers = workers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return taskName;
    }

    public void setName(String taskName) {
        this.taskName = taskName;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
