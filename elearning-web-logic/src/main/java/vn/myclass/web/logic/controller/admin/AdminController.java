package vn.myclass.web.logic.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @RequestMapping(value = "/admin/home.html", method = RequestMethod.GET)
    public ModelAndView hoHomePage() {
        ModelAndView mav = new ModelAndView("admin/home");
        return mav;
    }
}
