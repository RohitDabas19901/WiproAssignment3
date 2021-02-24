package com.rohitdabas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohitdabas.beans.EmployeeDTO;
import com.rohitdabas.dao.EmployeeDAO;

@Service ("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager
{
    @Autowired
    EmployeeDAO dao;
     
    public EmployeeDTO createNewEmployee()
    {
    	
    	
    	
        return dao.createNewEmployee();
    }
}