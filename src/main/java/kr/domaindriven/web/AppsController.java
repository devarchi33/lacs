package kr.domaindriven.web;

import kr.domaindriven.model.Instructor;
import kr.domaindriven.model.SelectedInstrouctor;
import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.TestModel.TestModel;
import kr.domaindriven.persistance.InstructorRepository;
import kr.domaindriven.persistance.SeminarRepository;
import kr.domaindriven.service.SeminarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        logger.info("현재 진행중인 세미나 화면..");

        Seminar currentSeminar = smService.findByIsCompleted(false);

        if (currentSeminar == null) {
            currentSeminar = new Seminar("현재 진행중인 세미나가 없습니다.");
        }

        model.addAttribute("currentSeminar", currentSeminar);
        model.addAttribute("page", "currentSeminar");

        return LAYOUT;
    }

    @RequestMapping(value = "/addSeminar", method = RequestMethod.GET)
    public String addSeminar(Model model) {
        logger.info("세미나 추가 폼 화면..");

        model.addAttribute("page", "addSeminar");

        return LAYOUT;
    }

    @RequestMapping(value = "/allSeminar", method = RequestMethod.GET)
    public String allSeminar(@PageableDefault Pageable pageable, Model model) {
        logger.info("모든 세미나 리스트 화면..");

        Page<Seminar> seminars = smService.findAll(pageable);
        model.addAttribute("seminars", seminars);

        model.addAttribute("page", "allSeminar");

        return LAYOUT;
    }

    @RequestMapping(value = "/castingInstructor", method = RequestMethod.GET)
    public String selectingInstructor(Model model) {
        logger.info("강사 섭외 상세 화면..");

        model.addAttribute("page", "castingInstructor");

        return LAYOUT;
    }

    @Autowired
    private InstructorRepository repository;

    @RequestMapping(value = "/adding_Instructor", method = RequestMethod.GET)
    public String addInstructor(@PageableDefault Pageable pageable,Model model) {
        TestModel testModel = new TestModel(); //test 데이터 입력을 위한 TestModel
        logger.info("강사 추가 화면..");
        /*Instructor instructor = repository.findByName("구강원");
        System.out.println(instructor.getName());*/
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
