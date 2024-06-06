package gb.org.demo_security_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/brand")
public class BrandController {
    @RequestMapping
    public String getBrand() {
        return "/admin/brand";
    }

    @RequestMapping("/{id}")
    public String getBrandDetail() {
        return "/admin/brand/detail";
    }

    @RequestMapping("/add")
    public String addBrand() {
        return "/admin/brand/add";
    }

}
