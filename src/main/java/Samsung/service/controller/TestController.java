package Samsung.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/chart")
    public String chart(Model model){
        return "/basic/basic";
    }

}