package gb.org.demo_security_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
    @RequestMapping
    public String getProduct() {
        return "/admin/product";
    }

    @RequestMapping("/{id}")
    public String getProductDetail() {
        return "/admin/product/detail";
    }

    @RequestMapping("/add")
    public String addProduct() {
        return "/admin/product/add";
    }
}
