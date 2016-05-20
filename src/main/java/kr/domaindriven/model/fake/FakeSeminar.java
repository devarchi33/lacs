package kr.domaindriven.model.fake;

import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.Task;
import kr.domaindriven.model.Worker;

import java.util.List;

/**
 * Created by jerry on 2016-05-20.
 * 동훈씨가 만든 세미나 클래스를 건들이지 않고 OCP를 최대한 지키기 위함.(따라서 상속을 받음)
 * 이 클래스의 목적은 세미나 작업 정보를 저장하고 제공하고자 함.
 */
public class FakeSeminar extends Seminar {

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    Instructor instructor;
    Worker worker;

    public FakeSeminar(long id, String name, List<Task> tasks) {
        super(id, name, tasks);
    }



}
