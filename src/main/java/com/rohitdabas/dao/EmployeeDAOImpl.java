package com.rohitdabas.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rohitdabas.beans.EmployeeDTO;

@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO
{
	/*
	 * @Autowired private JdbcTemplate jdbcTemplate;
	 */
	
	
    public EmployeeDTO createNewEmployee()
    {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(1);
        e.setFirstName("Rohit");
        e.setLastName("Dabas");
        return e;
    }
}