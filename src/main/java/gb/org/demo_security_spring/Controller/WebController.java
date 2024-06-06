package gb.org.demo_security_spring.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {
    @GetMapping("/")
    public String home() {
        return "/index";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/user/{id}")
    public String userDetail(@PathVariable int id) {
        return "/user/detail";
    }




}
