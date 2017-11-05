package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Drew on 08.10.2017.
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index1() {
        return "home";
    }

    @GetMapping(value = "/home")
    public String index2() {
        return "home";
    }

}
