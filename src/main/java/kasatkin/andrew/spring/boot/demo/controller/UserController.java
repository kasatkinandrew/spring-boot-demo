package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Drew on 29.10.2017.
 */
@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String user() {

        return "user";
    }

}
