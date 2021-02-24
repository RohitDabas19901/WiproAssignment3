package com.rohitdabas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class WelcomeController implements Controller {

	/*
	 * public ModelAndView handleRequest(HttpServletRequest arg0,
	 * HttpServletResponse arg1) throws Exception { // TODO Auto-generated method
	 * stub return null; }
	 */
	
	  public ModelAndView handleRequest(HttpServletRequest request,
	  HttpServletResponse response) throws Exception {
		  
		  ModelAndView model=new ModelAndView("welcome");
		  
		  model.addObject("msg",
	      "Controller Bean Name mapping Rohit Dabas!"); 
	      
	      return model; 
	  
	  }
	 

}