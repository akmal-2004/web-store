package uz.greenwhite.webstore.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminDashboardController {

    @GetMapping()
    public String dashboard() {
        return "admin/dashboard";
    }
}