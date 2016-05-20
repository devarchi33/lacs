package kr.domaindriven.model.fake;

/**
 * Created by jerry on 2016-05-17.
 */
public class FakeModel {
    private Instructor [] instructors = new Instructor[5];

    private String account;
    private String subject;
    private String date;
    private String file;
    private String instructorName;
    private String instructorPhoneNum;
    private String worker;

    public FakeModel(){
        instructors[0] = new Instructor("강사1","010-1234-5678","hello@domaindriven.co.kr");
        instructors[1] = new Instructor("강사2","010-2222-5678","hello@domaindriven.co.kr");
        instructors[2] = new Instructor("강사3","010-3333-5678","hello@domaindriven.co.kr");
        instructors[3] = new Instructor("강사4","010-4444-5678","hello@domaindriven.co.kr");
        instructors[4] = new Instructor("강사5","010-5555-5678","hello@domaindriven.co.kr");
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorPhoneNum() {
        return instructorPhoneNum;
    }

    public void setInstructorPhoneNum(String instructorPhoneNum) {
        this.instructorPhoneNum = instructorPhoneNum;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWorker() {
        return worker;
    }
    public void setWorker(String worker) {
        this.worker = worker;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

}
