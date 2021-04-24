package com.te.springboot1.dao;

import java.util.List;

import com.te.springboot1.beans.EmployeeBean;



public interface EmployeeDAO {
	
	public EmployeeBean authenticate(int id, String password);
	
	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmp(int id);
	
	public List<EmployeeBean> getAllEmployees();
	
	public boolean updateEmp(EmployeeBean bean);
	
	public boolean getAddEmpForm(EmployeeBean bean);

}
