package gb.org.demo_security_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/order")
public class OrderController {
    @RequestMapping
    public String getOrder() {
        return "/admin/order";
    }

    @RequestMapping("/{id}")
    public String getOrderDetail() {
        return "/admin/order/detail";
    }

    @RequestMapping("/add")
    public String addOrder() {
        return "/admin/order/add";
    }
}
