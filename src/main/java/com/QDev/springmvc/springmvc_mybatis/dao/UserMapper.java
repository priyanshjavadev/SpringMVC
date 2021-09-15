package com.QDev.springmvc.springmvc_mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.QDev.springmvc.springmvc_mybatis.model.Employee;
import com.QDev.springmvc.springmvc_mybatis.util.*;

@Repository
public class UserMapper {
	public void saveEmployeeData(Employee employee) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertEmployee", employee);
		session.commit();
		session.close();
	}

	public List<Employee> showEmployeeData() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Employee> lt1 = session.selectList("showEmployee");
		session.commit();
		session.close();
		return lt1;
	}

	public void deleteEmployee(int employeeId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteEmployee", employeeId);
		session.commit();
		session.close();
		
	}

	public Employee getuserDataByID(int employeeId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Employee employee = session.selectOne("findEmployee", employeeId);
		session.commit();
		session.close();
		return employee;
	}

	public void updateEmployeeData(Employee employee) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateEmployee", employee);
		session.commit();
		session.close();
	}
}
