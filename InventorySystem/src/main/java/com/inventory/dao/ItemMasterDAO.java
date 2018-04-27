package com.inventory.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.model.ItemMaster;
import com.inventory.util.HibernateUtil;

public class ItemMasterDAO extends HibernateUtil {
	 
	//For adding items in the Items table.
	public ItemMaster add(ItemMaster item) {
		System.out.println("Begin ITEM ADD");
	SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
	System.out.println("Session Factory created");
	Session session = sessionFactory.openSession();
	System.out.println("Session OPENED");
	session.beginTransaction();
	System.out.println("Session TRANSACTION Start");
	session.save(item);
	System.out.println("Transaction SAVED");
	session.getTransaction().commit();
	System.out.println("Transaction commited");
	return item;
	}
	 
	//For deleting item from Items table.
	 
	public ItemMaster delete(Long id) {
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
	session.beginTransaction();
	ItemMaster item = (ItemMaster) session.load(ItemMaster.class, id);
	if(null != item) {
	session.delete(item);
	}
	session.getTransaction().commit();
	return item;
	}
	// For generating , executing hibernate select query and returns items as a list.
	 
	@SuppressWarnings("unchecked")
	public List<ItemMaster> list() {
		System.out.println("INSIDE LIST METHOD");
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
	List<ItemMaster> items = null;
	try {
	items = (List<ItemMaster>)session.createQuery("from ItemMaster").getResultList();
	System.out.println("INSIDE LIST METHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXD"); 
	} catch (HibernateException e) {
				e.printStackTrace();
	session.getTransaction().rollback();
	}
	System.out.println("INSIDE LIST METHORRRRRRRRRRRE");
	//session.getTransaction().commit();
	System.out.println("INSIDE LIST METHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXZZZZZZZZZZZZZZZZZZZZZ");
	return items;
	}
	}
