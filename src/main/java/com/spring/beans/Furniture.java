package com.spring.beans;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="chipopo")
public class Furniture {

	@Id
	private long id;

	private String name;
	private float price;
	private String type;

	public Furniture() {
	}

	public Furniture(long id, String name, float price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
