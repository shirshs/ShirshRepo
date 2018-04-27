package com.inventory.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "Items")
public class ItemMaster implements Serializable {

	private static final long serialVersionUID = 2594899692271893943L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "item_name")
	private String item_name;

	@Column(name = "category")
	private String category;
	@Column(name = "price")
	private double price;
	@Column(name = "quantity")
	private int quantity;

	@Temporal(TemporalType.DATE)
	@Column(name = "created")
	private Date created;

	public Date getCreated() {
		// return new Date();
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
