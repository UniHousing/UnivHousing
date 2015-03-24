package com.javaweb.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.Ticket;


public class TicketDAOImpl extends HibernateDaoSupport implements TicketDAO {
	// save
		public void save(Ticket ticket) {
			this.getHibernateTemplate().save(ticket);
		}

		// delete
		public void delete(int id) {
		
			this.getHibernateTemplate().delete(
					this.getHibernateTemplate().get(Ticket.class, id));
		}

		//update
		public void update(Ticket ticket) {
			this.getHibernateTemplate().saveOrUpdate(ticket);
		}

		//findAll
		public List queryAll() {
			return this.getHibernateTemplate().find("from Ticket");
		}

		//find By Id
		public Ticket queryByID(int id) {
			return (Ticket) this.getHibernateTemplate().get(Ticket.class, id);
		}
}
