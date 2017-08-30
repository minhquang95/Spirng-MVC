package vn.myclass.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/admin/home.html")
    public ModelAndView modelAndView(){
        ModelAndView mav = new ModelAndView("/admin/home");
        return mav;
    }
}
