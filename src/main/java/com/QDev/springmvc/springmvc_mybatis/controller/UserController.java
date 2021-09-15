package com.QDev.springmvc.springmvc_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.*;

import com.QDev.springmvc.springmvc_mybatis.model.Employee;
import com.QDev.springmvc.springmvc_mybatis.service.UserService;

@Controller
@RequestMapping()
public class UserController {

	@Autowired()
	UserService userService;
	
	@RequestMapping("/read")
	public String showEmployee(Model model) {
		model.addAttribute("employeelist", userService.showEmployee());
		return "listOfEmployee";
	}
	
	@RequestMapping("/addUser_Form")
	public String addEmployee(Model model){
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		try {
			if(employee.getName() != null && employee.getName() != "") {
				if(employee.getId() == 0) {
					userService.saveEmployee(employee);
				}else {
					userService.updateEmployee(employee);
				}
				return "redirect:/read";}
			else {
				throw new Exception("Please Enter Name");
				return "redirect:/employeeForm";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int employeeId){
		userService.deleteEmployee(employeeId);
		return "redirect:/read";
	}

	@RequestMapping("/update")
	public String getuserByID(@RequestParam("employeeId") int employeeId, Model model) {
		model.addAttribute("employee", userService.getuserByID(employeeId));
		return "employeeForm";
	}
}
