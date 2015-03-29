package com.javaweb.dao;

import java.util.List;

import org.apache.struts2.components.Select;

import com.javaweb.po.Ticket;


public class TicketDAOImpl extends BaseDAOImpl<Ticket> implements TicketDAO {

	@Override
	public List<Ticket> findTicketsbyStudentId(int sid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("select * from ticket where student_id="+sid);
	}
	// save
		
}
