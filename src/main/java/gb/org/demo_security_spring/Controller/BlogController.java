package gb.org.demo_security_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/blog")
public class BlogController {
    @RequestMapping
    public String getBlog() {
        return "/admin/blog";
    }

    @RequestMapping("/{id}")
    public String getBlogDetail() {
        return "/admin/blog/detail";
    }

    @RequestMapping("/add")
    public String addBlog() {
        return "/admin/blog/add";
    }
}
