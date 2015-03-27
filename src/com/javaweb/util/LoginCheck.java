 package com.javaweb.util;

public class LoginCheck {
	public boolean isLogin(String name,String password){
		if (name.equals("abc") && password.equals("123456")) {
			return true;
			
		}
		else {
			return false;
		}
	}
}
