package com.javaweb.action;

import java.util.HashMap;
import java.util.List;

import com.javaweb.po.Staff;
import com.javaweb.po.Student;
import com.javaweb.service.StaffService;
import com.javaweb.service.StudentService;
import com.javaweb.util.LoginCheck;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public static final String ADMIN="admin";
	private String userName;
	private String password;
	private LoginCheck lc;
	private StudentService studentService;
	private StaffService staffService;
	private HashMap<String, String> passMap;
	private HashMap<String, String> typeMap;

	public LoginCheck getLc() {
		return lc;
	}

	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	@Override
	public String execute() {
		passMap = new HashMap<String, String>();
		typeMap = new HashMap<String, String>();
		List<Student> studentlist = studentService.queryAllStudent();
		List<Staff> staffList = staffService.queryAllStaff();
		if (!studentlist.isEmpty()) {
			for (Student student : studentlist) {
				passMap.put(student.getUsername(), student.getPassword());
				typeMap.put(student.getUsername(), student.getType());
			}
		}
		if (!staffList.isEmpty()) {
			for (Staff staff : staffList) {
				passMap.put(staff.getUsername(), staff.getPassword());
				typeMap.put(staff.getUsername(), ADMIN);
			}
		}
		if (lc.isLogin(getUserName(), getPassword(), passMap, typeMap).equals(
				"error")) {
			ActionContext.getContext().getSession().put("login", "false");
			return ERROR;
		} else {
			ActionContext.getContext().getSession().put("login", "true");
			return typeMap.get(getUserName());
		}

	}


}
