package gb.org.demo_security_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/admin/category")
public class CategoryController {
    @GetMapping
    public String getCategory() {
        return "/admin/category";
    }

    @GetMapping("/{id}")
    public String getCategoryDetail() {
        return "/admin/category/detail";
    }

    @GetMapping("/add")
    public String addCategory() {
        return "/admin/category/add";
    }

}
