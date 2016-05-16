package kr.domaindriven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jerry on 2016-05-15.
 */
@Controller
public class AppsController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
