package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "PRODUCT")
@Component
public class Product {
	
	@Id
	@Column
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	@Column
	private String category_id;
	
	@Column
	private String supplier_id;
	
	
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	/*public String getCategory_id() {
	return category_id;
}
public void setCategory_id(String category_id) {
	this.category_id = category_id;
}
*/

/*public String getSupplier_id() {
	return supplier_id;
}
public void setSupplier_id(String supplier_id) {
	this.supplier_id = supplier_id;
}*/

/*@ManyToOne
@JoinColumn(name="category_id", nullable = false, updatable = false, insertable = false)
	private Category category;

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}*/

/*@ManyToOne
@JoinColumn(name="supplier_id",nullable = false, updatable = false, insertable = false)
private Supplier supplier;*/


/*@ManyToOne
@JoinColumn(name="category_id", updatable = false, insertable = false)
private Category category;

@ManyToOne
@JoinColumn(name="supplier_id", updatable = false, insertable = false)
private Supplier supplier;*/
	
}
