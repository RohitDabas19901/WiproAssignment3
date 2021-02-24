package com.rohitdabas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class ControllerInterfaceExample implements Controller {


	
	  public ModelAndView handleRequest(HttpServletRequest request,
	  HttpServletResponse response) throws Exception {
		  
		  ModelAndView model=new ModelAndView("page");
		  
		  model.addObject("msg",
	      "Controller Interface Example Rohit Dabas!"); 
	      
	      return model; 
	  
	  }
	 

}