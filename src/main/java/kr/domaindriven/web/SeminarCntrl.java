package kr.domaindriven.web;

import kr.domaindriven.model.Seminar;
import kr.domaindriven.model.form.SeminarForm;
import kr.domaindriven.service.SeminarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by donghoon on 2016. 5. 29..
 * Seminar 에 대해서 Rest로 CRUD 작업을 할 수 있는 Controller 입니다.
 */

@RestController
@RequestMapping(value = "/seminar")
public class SeminarCntrl {
    private Logger logger = LoggerFactory.getLogger(SeminarCntrl.class);

    @Autowired
    private SeminarService service;

    @ModelAttribute
    public SeminarForm setUpForm() {
        return new SeminarForm();
    }

    /**
     * 세미나 추가 기능 구현.
     *
     * @param form
     * @param result
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Seminar save(@Validated SeminarForm form, BindingResult result) {
        logger.info("세미나 생성.");
        if (result.hasErrors()) {
            List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList) {
                logger.error(error.toString());
            }
            return null;
        }

        Seminar newSeminar = new Seminar(form.getTitle(), form.getDate());

        return service.save(newSeminar);
    }
}
