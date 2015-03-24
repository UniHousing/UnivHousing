package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Ticket;

public interface TicketDAO {
	public void save(Ticket ticket);

	public void delete(int id);

	public void update(Ticket ticket);
	
	public List queryAll();
	
	public Ticket queryByID(int id);
}
