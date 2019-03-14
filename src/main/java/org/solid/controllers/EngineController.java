package org.solid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EngineController {

	@RequestMapping("/welcome")
	public ModelAndView welcome() 
	{
		String message = "Welcome Sergio, learn about game engines also!";
		return new ModelAndView("welcome", "message", message);
	}
	
}
