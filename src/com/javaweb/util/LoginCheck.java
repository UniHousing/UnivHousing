 package com.javaweb.util;

import java.util.HashMap;

public class LoginCheck {


	public String isLogin(String name,String password,HashMap<String, String>passMap,HashMap<String, String>typeMap){
		if (passMap==null || typeMap==null) {
			return "error";
		}
		if (passMap.containsKey(name)&& password.equals(passMap.get(name))) {
			return typeMap.get(name);
		}
		else {
			return "error";
		}
	}

}
