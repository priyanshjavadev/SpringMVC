package com.QDev.springmvc.springmvc_mybatis.service;

import java.util.List;

import com.QDev.springmvc.springmvc_mybatis.model.Employee;

public interface UserService {

	void saveEmployee(Employee employee);

	List<Employee> showEmployee();

	void deleteEmployee(int employeeId);

	Employee getuserByID(int employeeId);

	void updateEmployee(Employee employee);
}
