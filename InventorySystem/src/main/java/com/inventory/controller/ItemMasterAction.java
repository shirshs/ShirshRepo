package com.inventory.controller;

import java.util.List;
import com.inventory.dao.ItemMasterDAO;
import com.inventory.model.ItemMaster;
import com.opensymphony.xwork2.ActionSupport;
 
public class ItemMasterAction extends ActionSupport {
 
  
	/**
	 * 
	 */
	private static final long serialVersionUID = -164719607080625432L;
	private ItemMaster item;
	private List<ItemMaster> itemList;
	private Long id;
	private ItemMasterDAO itemMasterDao;
	 
	public ItemMaster getItem() {
	return item;
	}
	 
	public void setItem(ItemMaster item) {
	this.item = item;
	}
	public ItemMasterAction() {
	itemMasterDao = new ItemMasterDAO();
	}
	 
	public String execute() {
	this.itemList = itemMasterDao.list();
	return SUCCESS;
	}
	 
	public String add() {
	System.out.println(getItem());
	System.out.println("ADD ACTION METHOD CALLED");
	try {
	ItemMaster item=getItem();
	item.setCreated(new java.util.Date()); // for current date to store on createdOn field.
	itemMasterDao.add(item);
	System.out.println("ADD ACTION COMPLETED SUCESSFULLY");
	} catch (Exception e) {
		System.out.println("ADD ACTION COMPLETEd with EXCPTION");
		e.printStackTrace();
	}
	System.out.println("ADD ACTION RETUREND SUCESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	this.itemList = itemMasterDao.list();
	System.out.println("ADD ACTION RETUREND SUCESSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
	return SUCCESS;
	}
	 
	public String list() {
	this.itemList = itemMasterDao.list();
	return SUCCESS;
	}
	 
	public String delete() {
	itemMasterDao.delete(getId());
	return SUCCESS;
	}
	 
	public List<ItemMaster> getItemList() {
	return itemList;
	}
	public void setItemList(List<ItemMaster> itemList) {
	this.itemList = itemList;
	}
	 
	public Long getId() {
	return id;
	}
	 
	public void setId(Long id) {
	this.id = id;
	}
	}