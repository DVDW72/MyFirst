package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	// listen to these HTTP requrests
	// value = root. (localhost:8080)
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootview()
	{
		return "index";
	}
	
}
