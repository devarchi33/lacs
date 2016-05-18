package kr.domaindriven;

import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.Task;
import kr.domaindriven.model.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2016-05-15.
 */
@Controller
public class AppsController {
    @RequestMapping("/")
    public String index(Model model) {

        //dummy data
        Worker park = new Worker(0l, "박세종");
        Worker lee = new Worker(1l, "이동훈");
        Worker ahn = new Worker(2l, "안재열");

        List<Worker> workersCastingSpeaker = new ArrayList<Worker>();
        workersCastingSpeaker.add(park);
        Task castingSpeaker = new Task(0l, "강사 섭외", workersCastingSpeaker);

        List<Worker> workersReservingPlace = new ArrayList<Worker>();
        workersReservingPlace.add(lee);
        Task reservingPlace = new Task(1l, "장소 예약", workersReservingPlace);

        List<Worker> workersMakingPoster = new ArrayList<Worker>();
        workersMakingPoster.add(ahn);
        Task makingPoster = new Task(2l, "포스터 제작", workersMakingPoster);

        List<Task> firstSeminarTasks = new ArrayList<Task>();
        firstSeminarTasks.add(castingSpeaker);
        firstSeminarTasks.add(reservingPlace);
        firstSeminarTasks.add(makingPoster);

        Seminar firstSeminar = new Seminar(0l, "제 1회 정기 세미나", firstSeminarTasks);

        List<Worker> workersCastingSpeaker2 = new ArrayList<Worker>();
        workersCastingSpeaker2.add(park);
        Task castingSpeaker2 = new Task(3l, "강사 섭외", workersCastingSpeaker);

        List<Worker> workersReservingPlace2 = new ArrayList<Worker>();
        workersReservingPlace2.add(lee);
        Task reservingPlace2 = new Task(4l, "장소 예약", workersReservingPlace);

        List<Worker> workersMakingPoster2 = new ArrayList<Worker>();
        workersMakingPoster2.add(ahn);
        Task makingPoster2 = new Task(5l, "포스터 제작", workersMakingPoster);

        List<Task> secondSeminarTasks = new ArrayList<Task>();
        secondSeminarTasks.add(castingSpeaker2);
        secondSeminarTasks.add(reservingPlace2);
        secondSeminarTasks.add(makingPoster2);

        Seminar secondSeminar = new Seminar(1l, "제 2회 정기 세미나", firstSeminarTasks);

        List<Seminar> seminars = new ArrayList<Seminar>();
        seminars.add(firstSeminar);
        seminars.add(secondSeminar);

        model.addAttribute("seminars", seminars);
        //!.dummy data

        return "index";
    }
}
