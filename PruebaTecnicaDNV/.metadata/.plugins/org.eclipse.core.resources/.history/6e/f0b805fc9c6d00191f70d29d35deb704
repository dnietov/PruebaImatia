/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.converter;

import org.springframework.stereotype.Component;

import com.david.pruebaimatia.entity.Task;
import com.david.pruebaimatia.model.TaskModel;

/**
 * The Class TaskConverter.
 */
@Component("taskConverter")
public class TaskConverter { 
	
	
	// Entity ---> Model
	public TaskModel task2taskmodel(Task task) {
		TaskModel taskModel = new TaskModel();
		taskModel.setName(task.getName());
		taskModel.setId(task.getId());
		
		return taskModel;
		
	}
	
	// Model ---> Entity 
	public Task taskmodel2task(TaskModel taskModel) {
		Task task = new Task();
		task.setName(taskModel.getName());
		task.setId(taskModel.getId());
		return task;
	
		
	}

}
