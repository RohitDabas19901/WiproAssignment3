package com.rohitdabas;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohitdabas.beans.EmployeeListVO;
import com.rohitdabas.beans.EmployeeVO;
import com.rohitdabas1.ResponseTransfer;
@RestController
public class HelloControllerRest {
	
	 @RequestMapping(value="/rest/response")
	 public  List<ResponseTransfer> displayWebserviceXml(Model model) {
		
		    List<ResponseTransfer> companies = new ArrayList<ResponseTransfer>();     
	        companies.add(new ResponseTransfer(3, "Rohit Dabas", "rohit.dabas@test.com"));       
	        companies.add(new ResponseTransfer(12, "Roobi Dabas", "roobi.dabas@test.com"));
	        companies.add(new ResponseTransfer(101, "Anuj Baliyan", "anuj.baliyan@test.com"));
	        companies.add(new ResponseTransfer(153, "Tanuj Baliyan", "tanuj.baliyan@test.com"));
	        companies.add(new ResponseTransfer(239, "Gajendra Nain", "gajendra.nain@test.com"));
	 
	        return companies;
	 }
	 
	 @RequestMapping(value = "/rest/employees")
	    public  EmployeeListVO getAllEmployees() 
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
	 
	 @RequestMapping(value = "/rest/employees/{id}")
	   public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) 
	    {
	        if (id <= 3) {
	            EmployeeVO employee = new EmployeeVO(1,"Rohit","Dabas","rohitDabasProgram@gmail.com");
	            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	        }
	        return new ResponseEntity(HttpStatus.NOT_FOUND);
	    }
	    
	 
	 @RequestMapping(value = "/rest/employees/one/{id}")
	    public  EmployeeVO getEmployeeByIdOne(@PathVariable("id") int id) 
	    {
	        if(id <= 3) {
	            EmployeeVO employee = new EmployeeVO(1,"Rohit","Dabas","rohitDabasProgram@gmail.com");
	            return employee;
	        }
	        EmployeeVO employee = new EmployeeVO(100,"Default","Default","Default@gmail.com");
            return employee;   
	    }
	 
	 
}
