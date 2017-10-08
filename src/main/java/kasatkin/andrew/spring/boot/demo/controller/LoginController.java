package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Drew on 08.10.2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login.html")
    public String login() {
        return "login.html";
    }


}
