package com.spring.beans;

import java.util.Collection;

import org.springframework.data.annotation.Id;

public class Factory {

	@Id
	private long id;

	private String name;
	
	private Collection<Furniture> furniture;

	public Factory(long id, String name, Collection<Furniture> furniture) {
		this.id = id;
		this.name = name;
		this.furniture = furniture;
	}

	public Factory() {
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

	public Collection<Furniture> getFurniture() {
		return furniture;
	}

	public void setFurniture(Collection<Furniture> furniture) {
		this.furniture = furniture;
	}

}
