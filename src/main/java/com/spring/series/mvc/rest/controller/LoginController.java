package com.spring.series.mvc.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.series.mvc.rest.model.Login;

@Controller
public class LoginController {
	@RequestMapping( value="/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	   
	    System.out.println("*****************************************************************************");
	   // mav.addObject("user", new User());
	    mav.addObject("login", new Login());
	    return mav;
	  }
}
