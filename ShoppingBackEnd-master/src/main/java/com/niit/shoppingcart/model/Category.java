package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "CATEGORY")
@Component
public class Category {
	
	@Id
	@Column
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="desc")
	private String desc;
	/*private Set<Product> products;

	@OneToMany(mappedBy="category",fetch = FetchType.EAGER)
	public Set<Product> getProducts()
	{
		return products;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}*/

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
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
