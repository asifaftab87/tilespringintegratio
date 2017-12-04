package org.asif.tile.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView myModelMethod(Model model){
    	ModelAndView mav = new ModelAndView("home");
    	return mav;
    }
	
	@RequestMapping(value="/registerform", method=RequestMethod.GET)
	public ModelAndView registerForm(){
		ModelAndView mav = new ModelAndView("registerForm");
    	return mav;
	}
	
}
