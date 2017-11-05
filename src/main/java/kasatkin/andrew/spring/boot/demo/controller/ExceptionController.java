package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Drew on 02.11.2017.
 */
@Controller
public class ExceptionController {

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
