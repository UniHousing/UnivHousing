package com.javaweb.action;

import com.javaweb.util.LoginCheck;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	private LoginCheck lc;
	
	public LoginCheck getLc() {
		return lc;
	}

	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}

	public String execute(){
		if (lc.isLogin(getUserName(), getPassword())) {
			ActionContext.getContext().getSession().put("login", "true");
			return SUCCESS;
		}
		else {
			return ERROR;
		}
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
