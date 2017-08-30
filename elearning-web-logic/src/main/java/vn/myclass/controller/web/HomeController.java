package vn.myclass.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/web/home.html")
    public ModelAndView modelAndView(){
        ModelAndView mav = new ModelAndView("/web/home");
        return mav;
    }
}
