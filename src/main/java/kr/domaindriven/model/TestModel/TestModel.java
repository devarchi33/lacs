package kr.domaindriven.model.TestModel;

import kr.domaindriven.model.Instructor;
import kr.domaindriven.model.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2016-05-24.
 * 기본 작업진행자 및 강사정보 제공을 위한 클래스
 */
public class TestModel {
    private List<Worker> workers = new ArrayList<Worker>();

    private List<Instructor> instructors = new ArrayList<Instructor>();

    public TestModel(){
        workers.add(new Worker(1,"안재열"));
        workers.add(new Worker(2,"이동훈"));
        workers.add(new Worker(3,"박세종"));

        instructors.add(new Instructor("강사1","010-1111-1111","hello1@domaindriven.co.kr"));
        instructors.add(new Instructor("강사2","010-2222-2222","hello2@domaindriven.co.kr"));
        instructors.add(new Instructor("강사3","010-3333-3333","hello3@domaindriven.co.kr"));
        instructors.add(new Instructor("강사4","010-4444-4444","hello4@domaindriven.co.kr"));
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}
