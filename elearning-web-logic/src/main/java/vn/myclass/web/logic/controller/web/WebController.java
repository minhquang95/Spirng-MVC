package vn.myclass.web.logic.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    @RequestMapping(value = "/home.html", method = RequestMethod.GET)
    public ModelAndView hoHomePage() {
        ModelAndView mav = new ModelAndView("web/home");
        return mav;
    }

}
