package com.rohitdabas;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rohitdabas.beans.Emp;
import com.rohitdabas.beans.EmployeeListVO;
import com.rohitdabas.beans.EmployeeVO;
import com.rohitdabas1.ResponseTransfer;
@Controller
public class HelloController {
	
	
@RequestMapping("/hello")
	public String display(HttpServletRequest sr,Model model)
	{
	        String name = sr.getParameter("name");        
	        String pass =sr.getParameter("password");
	        if (name.equalsIgnoreCase("Rohit"))
	        {
	           model.addAttribute("msg","Rohit dabas Program Executed");
	 		   return "index";    	       	
	        }
	        else 
	        {
	        	model.addAttribute("notValid","Not a valid User");
	        	return "LoginFailed";
	        }
	}





	
	 @RequestMapping("/")
	 public String displayFirstPage(Model model) {
		// model.addAttribute("msg","Rohit dabas Program Executed");
	  return "loginPage"; 
	 }
	 
	 
	 
	 
	 
	 @RequestMapping(value="/response")
	 public @ResponseBody List<ResponseTransfer> displayWebserviceXml(Model model) {
		 
		    List<ResponseTransfer> companies = new ArrayList<ResponseTransfer>();     
	        companies.add(new ResponseTransfer(3, "Rohit Dabas", "rohit.dabas@test.com"));       
	        companies.add(new ResponseTransfer(12, "Roobi Dabas", "roobi.dabas@test.com"));
	        companies.add(new ResponseTransfer(101, "Anuj Baliyan", "anuj.baliyan@test.com"));
	        companies.add(new ResponseTransfer(153, "Tanuj Baliyan", "tanuj.baliyan@test.com"));
	        companies.add(new ResponseTransfer(239, "Gajendra Nain", "gajendra.nain@test.com"));
	 
	        return companies;
	 
	 }
	 
	 
	  @RequestMapping(value = "/employees")
	    public @ResponseBody EmployeeListVO getAllEmployees() 
	    {
	        EmployeeListVO employees = new EmployeeListVO();        
	        EmployeeVO empOne = new EmployeeVO(1,"Rohit","Dabas","rohitdabasProgram@gmail.com");
	        EmployeeVO empTwo = new EmployeeVO(2,"Roobi","Baliyan","asinghal@yahoo.com");
	        EmployeeVO empThree = new EmployeeVO(3,"Anuj","Baliyan","kmishra@gmail.com");
	        employees.getEmployees().add(empOne);
	        employees.getEmployees().add(empTwo);
	        employees.getEmployees().add(empThree);
	        return employees;
	    }
	  
	  
	  
	     
	    @RequestMapping(value = "/employees/{id}")
	    public @ResponseBody ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) 
	    {
	        if (id <= 3) {
	            EmployeeVO employee = new EmployeeVO(1,"Rohit","Dabas","rohitDabasProgram@gmail.com");
	            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	        }
	        return new ResponseEntity(HttpStatus.NOT_FOUND);
	    }
	    
	    
	    @RequestMapping(value = "/employees/one/{id}")
	    public @ResponseBody EmployeeVO getEmployeeByIdOne(@PathVariable("id") int id) 
	    {
	        if (id <= 3) {
	            EmployeeVO employee = new EmployeeVO(1,"Rohit","Dabas","rohitDabasProgram@gmail.com");
	            return employee;
	        }
	        
	        EmployeeVO employee = new EmployeeVO(100,"Default","Default","Default@gmail.com");
            return employee;
	        //return employee;
	    }
	    
	    
	    @RequestMapping("/resourcebundle")
		 public String displaResource(Model model) {
		
		  return "hello"; 
		 }
	    
	    

	    @RequestMapping("/xmlreso")
		 public String displayXmlviewResolver(Model model) {
		
		  return "dummy"; 
		 }
	    
	    
	    
	    
	    @ModelAttribute(name= "countrieslist")
	    public List<String> populateCountries() {
	 
	    	System.out.println("**********************************************************");
	    	
	    	
	    	
	        List<String> countries= new ArrayList<String>();
	        countries.add("India");
	        countries.add("United States");
	        countries.add("Japan");
	        countries.add("Australia");
	        countries.add("Canda");     
	 
	        return countries;
	    }
	    
	    
	    
	    @RequestMapping(value= "/init", method= RequestMethod.GET)
	    public ModelAndView initView(@ModelAttribute(name= "countrieslist") List<String> countries) {
	    	System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
	    	
	        ModelAndView modelview = new ModelAndView();
	        modelview.addObject("message", "This is an example of using the @ModelAttribute annotation .....!");
	        modelview.setViewName("output");
	 
	        return modelview;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    @RequestMapping("/empform")  
	    public ModelAndView showform(){  
	         //command is a reserved request attribute name, now use <form> tag to show object data  
	        return new ModelAndView("empform","command",new Emp());  
	    }  
	    
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
	        //write code to save emp object  
	        //here, we are displaying emp object to prove emp has data  
	        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
	          
	        
	        List<Emp> list=new ArrayList<Emp>();  
	        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
	        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
	        list.add(new Emp(3,"sachin",55000f,"Care Taker"));
	        
	        list.add(emp);
	        
	        
	       return new ModelAndView("viewemp","list",list);
	        
	       // return new ModelAndView("empform","command",emp);//will display object data  
	      //  return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    }  
	      
	    @RequestMapping("/viewemp")  
	    //public ModelAndView viewemp(HttpSession session){
	 	   
	    public ModelAndView viewemp(){
	    
	    	 //session.setAttribute("Name", name);
	    	 //session.setMaxInactiveInterval(60);
	    	 //session.getAttribute("");
	    	
	    	
	    	
	    	
	    	///session.invalidate();
	    	
	    	
	    	
	        //write the code to get all employees from DAO  
	        //here, we are writing manual code of list for easy understanding  
	        List<Emp> list=new ArrayList<Emp>();  
	        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
	        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
	        list.add(new Emp(3,"sachin",55000f,"Care Taker"));
	        
	       // list.add(emp);
	        
	        
	          
	        return new ModelAndView("viewemp","list",list);  
	    }  
	    
	  
}
