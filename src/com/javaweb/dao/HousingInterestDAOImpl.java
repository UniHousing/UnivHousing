package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.HousingInterest;


public class HousingInterestDAOImpl extends BaseDAOImpl<HousingInterest>implements HousingInterestDAO {

	public List findHousingIdbyInterest(String interest){
		return queryByAttribute(HousingInterest.class, "interests", interest);
	}

}
