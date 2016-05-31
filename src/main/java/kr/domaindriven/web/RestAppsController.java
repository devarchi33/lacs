package kr.domaindriven.web;

import kr.domaindriven.model.Instructor;
import kr.domaindriven.model.TestModel.TestModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jerry on 2016-05-27.
 * JSON 방식으로 값을 전달 해 줄때 필요한 컨트롤러를 모아놓은 클래스.
 */

//입력받은 인덱스 값을 가지고(-1을 수행한다) 강사의 전화번호 호출을 하기위해 AJAX와 연동하는 컨트롤러
@RestController
public class RestAppsController {
    @RequestMapping(value = "findInstructorsPhoneNumber", method = RequestMethod.POST)
    public String instructor(@RequestBody String indexNum) {
        int tempIndexnum = Integer.parseInt(indexNum) - 1;
        return new TestModel().getInstructors().get(tempIndexnum).getPhoneNumber();
    }

    @RequestMapping("/test")
    public String test(String name) {
        return "Return: " + name;
    }
}
