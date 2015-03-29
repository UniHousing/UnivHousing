 package com.javaweb.util;

import java.util.HashMap;

public class LoginCheck {


	public boolean isLogin(int inputId,String inputPassword, String password){
		if (inputPassword.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

}
