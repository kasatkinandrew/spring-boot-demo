package kasatkin.andrew.spring.boot.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Drew on 08.10.2017.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/login";
    }


}
