package sample_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
