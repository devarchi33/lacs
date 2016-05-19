package kr.domaindriven.model.fake;

/**
 * Created by jerry on 2016-05-17.
 */
public class FakeModel {
    private Instructor [] instructors = new Instructor[5];

    public FakeModel(){
        instructors[0] = new Instructor("강사1","010-1234-5678","hello@domaindriven.co.kr");
        instructors[1] = new Instructor("강사2","010-2222-5678","hello@domaindriven.co.kr");
        instructors[2] = new Instructor("강사3","010-3333-5678","hello@domaindriven.co.kr");
        instructors[3] = new Instructor("강사4","010-4444-5678","hello@domaindriven.co.kr");
        instructors[4] = new Instructor("강사5","010-5555-5678","hello@domaindriven.co.kr");
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

}
