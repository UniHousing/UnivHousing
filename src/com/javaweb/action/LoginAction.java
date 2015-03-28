package com.javaweb.action;

import java.util.HashMap;
import java.util.List;

import com.javaweb.po.User;
import com.javaweb.service.UserService;
import com.javaweb.util.LoginCheck;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String password;
	private LoginCheck lc;
	private UserService userService;
	private HashMap<String, String> passMap;
	private HashMap<String, String> typeMap;

	public LoginCheck getLc() {
		return lc;
	}

	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}

	@Override
	public String execute() {
		passMap = new HashMap<String, String>();
		typeMap = new HashMap<String, String>();
		List<User> userlist = userService.queryAllUser();
		if (!userlist.isEmpty()) {
			for (User user : userlist) {
				String tempName = user.getUsername();
				String tempPassword = user.getPassword();
				String tempType = user.getType();
				System.out.println(user.getUsername());
				passMap.put(tempName, tempPassword);
				typeMap.put(tempName, tempType);
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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
