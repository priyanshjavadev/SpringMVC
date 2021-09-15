package com.QDev.springmvc.springmvc_mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QDev.springmvc.springmvc_mybatis.dao.UserMapper;
import com.QDev.springmvc.springmvc_mybatis.model.Employee;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	public void saveEmployee(Employee employee) {
		userMapper.saveEmployeeData(employee);
	}
	
	public List<Employee> showEmployee() {
		List<Employee> lt = userMapper.showEmployeeData();
		return lt;
	}
	
	public void deleteEmployee(int employeeId) {
		userMapper.deleteEmployee(employeeId);
	}

	public Employee getuserByID(int employeeId) {
		Employee employee = userMapper.getuserDataByID(employeeId);
		return employee;
	}

	public void updateEmployee(Employee employee) {
		userMapper.updateEmployeeData(employee);
		
	}

}
