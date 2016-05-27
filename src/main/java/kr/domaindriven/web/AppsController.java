package kr.domaindriven.web;

import kr.domaindriven.model.SelectedInstrouctor;
import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.TestModel.TestModel;
import kr.domaindriven.service.SeminarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2016-05-15.
 */
@Controller
public class AppsController {

    @Autowired
    private SeminarService smService;

    @RequestMapping("/")
    public String index(Model model) {

        //dummy data
        Seminar firstSeminar = new Seminar("제 1회 정기 세미나");
        Seminar secondSeminar = new Seminar("제 2회 정기 세미나");

        List<Seminar> seminars = new ArrayList<Seminar>();
        seminars.add(firstSeminar);
        seminars.add(secondSeminar);

        model.addAttribute("seminars", seminars);
        //!.dummy data

        Long smCount = smService.count();
        model.addAttribute("smCount", smCount);

        return "index";
    }

    @RequestMapping(value = "/adding_Instructor", method = RequestMethod.GET)
    public String addInstructor(Model model) {
        TestModel testModel = new TestModel(); //test 데이터 입력을 위한 TestModel
        SelectedInstrouctor selectedInstrouctor = new SelectedInstrouctor("1회 세미나", testModel.getWorkers(), testModel.getInstructors());
        model.addAttribute("selectedInstrouctor", selectedInstrouctor);
        return "addingInstructor";
    }

    @RequestMapping(value = "/adding_Instructor", method = RequestMethod.POST)
    public String addInstructor(@ModelAttribute SelectedInstrouctor selectingInstrouctor, Model model) {
        SelectedInstrouctor selectedInstrouctor = selectingInstrouctor;
        model.addAttribute("selectingInstrouctor", selectedInstrouctor);
        return "seminarInstructor";
    }

}
