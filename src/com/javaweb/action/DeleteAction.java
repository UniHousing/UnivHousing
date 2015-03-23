package com.javaweb.action;


import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	//²úÆ·ID
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
		//Íš¹ýµ÷ÓÃÒµÎñÂßŒ­×éŒþÉŸ³ýžÃIDÓÃ»§
		if(userService.deleteUser(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}