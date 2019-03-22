package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.EmployeeDTO;

@Component
public interface EmployeeService {
	
	public void registEmployee(EmployeeDTO emp);
	
	public List<EmployeeDTO> bringEmployeeList();
	public List<EmployeeDTO> retrieveEmployees(String searchWord);
	public EmployeeDTO retrieveEmployee(String searchWord);
	
	public int countEmployees();
	public boolean existEmployee(EmployeeDTO emp);
	
	public void modifyEmployee(EmployeeDTO emp);
	public void removerEmployee(EmployeeDTO emp);
	
	

}
