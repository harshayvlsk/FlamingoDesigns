package com.Harsha.Flamingo.DAO.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Harsha.Flamingo.DAO.SuppliersDao;
import com.Harsha.Flamingo.model.Suppliers;
@Repository("suplliersDao")
public class SuppliersDaoImpl implements SuppliersDao {

	@Autowired // connecting my objects
	SessionFactory sessionFactory;
	
	public SuppliersDaoImpl(SessionFactory sessionFactory )
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean save(Suppliers suppliers) {
	
		try {
			sessionFactory.getCurrentSession().save(suppliers);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean update(Suppliers suppliers) {
		
		try {
			sessionFactory.getCurrentSession().update(suppliers);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	@Transactional
	public boolean delete(Suppliers suppliers) {
		
		try {
			sessionFactory.getCurrentSession().delete(suppliers);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	@Transactional
	public Suppliers get(String id) {
		
	 return (Suppliers)  sessionFactory.getCurrentSession().get(Suppliers.class, id);
		
	}
	@Transactional
	public List<Suppliers> list() {
	
		String hql = "from Suppliers";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}
}
