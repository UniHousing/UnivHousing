package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.User;
import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAction extends ActionSupport {
	private int id;

	
	//ÒµÎñÂßŒ­×éŒþ
	private UserService userService;

	//ÉèÖÃÒµÎñÂßŒ­×éŒþ
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String execute() throws Exception {
		//Íš¹ýµ÷ÓÃÒµÎñÂßŒ­×éŒþ»ñµÃžÃIDµÄÓÃ»§
		User user = userService.queryUserByID(id);
		//œ«ËùµÃÓÃ»§ÐÅÏ¢Ž¢ŽæÔÚrequest·¶Î§ÖÐ
		ServletActionContext.getRequest().setAttribute("user", user);
		return SUCCESS;
	}





}