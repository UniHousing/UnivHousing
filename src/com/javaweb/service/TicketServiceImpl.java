package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.TicketDAO;
import com.javaweb.po.Ticket;


public class TicketServiceImpl implements TicketService{
	private TicketDAO ticketDAO;

	public void setTicketDAO(TicketDAO ticketDAO) {
		this.ticketDAO = ticketDAO;
	}

	// add User
	public boolean addTicket(Ticket ticket) {
		if (ticketDAO.queryByID(Ticket.class, ticket.getId()) == null) {
			ticketDAO.save(ticket);
		} else {
			return false;
		}
		return true;
	}

	public boolean deleteTicket(int id) {
		if (ticketDAO.queryByID(Ticket.class,id) != null) {
			ticketDAO.delete(Ticket.class,id);
		} else {
			return false;
		}
		return true;
	}

	public boolean updateTicket(Ticket ticket) {
		if (ticketDAO.queryByID(Ticket.class,ticket.getId()) != null) {
			ticketDAO.update(ticket);
		} else {
			return false;
		}
		return true;
	}

	public List queryAllTicket() {
		return ticketDAO.queryAll(Ticket.class);
	}

	public Ticket queryTicketByID(int id) {
		return ticketDAO.queryByID(Ticket.class,id);
	}


}
