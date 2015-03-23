package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllAction extends ActionSupport {
	//业务逻辑组件
	private UserService userService;

	//设置业务逻辑组件
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		//通过调用业务逻辑组件获得所有的用户
		List all = userService.queryAllUser();
		//将所有用户List储存在request范围中
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
