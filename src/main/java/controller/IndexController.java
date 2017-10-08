package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Drew on 08.10.2017.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

}
