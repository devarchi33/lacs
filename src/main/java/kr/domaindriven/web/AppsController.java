package kr.domaindriven.web;

import kr.domaindriven.model.SelectedInstrouctor;
import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.TestModel.TestModel;
import kr.domaindriven.service.SeminarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jerry on 2016-05-15.
 */
@Controller
public class AppsController {
    private final Logger logger = LoggerFactory.getLogger(AppsController.class);
    private final String LAYOUT = "layout";

    @Autowired
    private SeminarService smService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        logger.info("Current Seminar page..");

        //dummy data
        Seminar firstSeminar = new Seminar("제 1회 정기 세미나", "05/29/2016");
        Seminar secondSeminar = new Seminar("제 2회 정기 세미나", "06/30/2016");

        List<Seminar> seminars = new ArrayList<Seminar>();
        seminars.add(firstSeminar);
        seminars.add(secondSeminar);

        model.addAttribute("seminars", seminars);
        //!.dummy data

        Long smCount = smService.count();
        model.addAttribute("smCount", smCount);

        model.addAttribute("page", "currentSeminar");

        return LAYOUT;
    }

    @RequestMapping(value = "/addSeminar", method = RequestMethod.GET)
    public String addSeminar(Model model) {
        logger.info("Add Seminar page..");

        model.addAttribute("page", "addSeminar");

        return LAYOUT;
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
