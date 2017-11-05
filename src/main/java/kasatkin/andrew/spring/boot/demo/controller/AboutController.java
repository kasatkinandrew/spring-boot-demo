package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Drew on 02.11.2017.
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
