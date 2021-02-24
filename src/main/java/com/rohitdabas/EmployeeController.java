package com.rohitdabas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohitdabas.beans.EmployeeDTO;
import com.rohitdabas.service.EmployeeManager;

@RestController ("employeeController")
public class EmployeeController 
{
        @Autowired
    EmployeeManager manager;
     
        
        
    @RequestMapping("/stero/employee")    
    public  EmployeeDTO createNewEmployee()
    {
        return manager.createNewEmployee();
    }
    
    
    
}