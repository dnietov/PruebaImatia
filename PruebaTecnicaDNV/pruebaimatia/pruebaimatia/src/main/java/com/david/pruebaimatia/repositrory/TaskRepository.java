/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.repositrory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.pruebaimatia.entity.Task;
import com.david.pruebaimatia.model.TaskModel;

/**
 * anotación repository de jpa
 */
@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Serializable>{
	
	public abstract Task findById (int id);
	
	

}
