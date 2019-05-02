/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * anotación entity e indico a qué tabla se corresponde
 */

@Entity
@Table(name = "task")
public class Task {

	/**
	 * anotaciones: indico qu es un id, que se genere automaticamente e indico el
	 * nombre que tiene en base de datos
	 */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

//	@Column(name="isdone")
//	private boolean isdone = false;

	/**
	 * al generar un constructor personalizado tenemos que generar un constructor
	 * vacío porque es el que va a utilizar spring por defecto para que hibernate
	 * pueda gestionar la entidad
	 */
	public Task() {

	}

	/**
	 * genero constructor para después utilizar un convertidor y generar un modelo
	 */
	public Task(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.isdone = isdone;
	}

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

//	public boolean isIsdone() {
//		return isdone;
//	}
//
//	public void setIsdone(boolean isdone) {
//		this.isdone = isdone;
//	}

}
