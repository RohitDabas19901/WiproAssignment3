package com.rohitdabas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
public class ControllerInterfaceExampleAbstract extends AbstractController {

	/*
	 * public ModelAndView handleRequest(HttpServletRequest arg0,
	 * HttpServletResponse arg1) throws Exception { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	  public ModelAndView handleRequestInternal (HttpServletRequest request,
	  HttpServletResponse response) throws Exception {
		  
		  ModelAndView model=new ModelAndView("pageAbstract");
		  
		  model.addObject("msg",
	      "Controller Interface Abstract Rohit Dabas!"); 
	      
	      return model; 
	  
	  }

	

}