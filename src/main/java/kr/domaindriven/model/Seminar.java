package kr.domaindriven.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
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

    /**
     * mongodb objectId 이용시 unique key 를 자동생성 값으로 사용할 것으로 예상되므로 setter 를 삭제함.
     */
    @Id
    private String id;
    private String title;
    private boolean isCompleted = false;
    private List<Task> tasks;

    /**
     * 기본 태스크를 세미나 객체가 생성될 때 만들어 준다.
     * 기본 테스크 : 강사 선정, 장소예약, 포스터 제작, 홍보, 회고.
     *
     * @param title
     */
    public Seminar(String title) {
        this.title = title;

        Task selectInstructor = new Task(LacsCnst.SELECT_INSTRUCTOR);
        Task reservePlace = new Task(LacsCnst.RESERVE_PLACE);
        Task makePoster = new Task(LacsCnst.MAKE_POSTER);
        Task registerSeminar = new Task(LacsCnst.REGISTER_SEMINAR);
        Task promostion = new Task(LacsCnst.PROMOTION);
        Task rememberance = new Task(LacsCnst.REMEMBERANCE);

        /**
         * 고정적 으로 예상되는 task 들을 Seminar 생성시 할당한다.
         */
        List<Task> taskMap = new ArrayList<Task>();
        taskMap.add(selectInstructor);
        taskMap.add(reservePlace);
        taskMap.add(makePoster);
        taskMap.add(registerSeminar);
        taskMap.add(promostion);
        taskMap.add(rememberance);
        this.tasks = taskMap;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
