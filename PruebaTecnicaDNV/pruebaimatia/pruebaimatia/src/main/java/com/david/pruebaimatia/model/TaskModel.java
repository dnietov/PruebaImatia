/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.model;

/**
 * Creo un modelo para poder convertir la entidad y poder trabajar en el
 * formulario solamente con los campos que me intersan
 */
public class TaskModel {

	private int id;
	private String name;
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public TaskModel(int id, String name, int status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public TaskModel() {

	}

	
	
	

}
