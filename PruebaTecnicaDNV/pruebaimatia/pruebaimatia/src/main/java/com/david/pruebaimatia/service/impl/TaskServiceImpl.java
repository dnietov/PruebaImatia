/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.david.pruebaimatia.converter.TaskConverter;
import com.david.pruebaimatia.entity.Task;
import com.david.pruebaimatia.model.TaskModel;
import com.david.pruebaimatia.repositrory.TaskRepository;
import com.david.pruebaimatia.service.TaskService;
import com.david.pruebaimatia.utils.Status;

@Service("taskServiceImpl")
public class TaskServiceImpl implements TaskService {

	/**
	 * creo instancia de TaskRespository  y TaskConverter mediante autowired
	 *
	 */
	@Autowired
	@Qualifier("taskRepository")
	private TaskRepository taskRepo;
	
	@Autowired
	@Qualifier("taskConverter")
	private TaskConverter taskConverter;
	
	/**
	 * 
	 * implementación para listar todas las tareas
	 *
	 */
	@Override
	public List<TaskModel> listAllTasks() {
		List<Task> tasks = taskRepo.findAll();
		List<TaskModel> tasksModel = new ArrayList<TaskModel>();
		for(Task task : tasks) {
			tasksModel.add(taskConverter.task2taskmodel(task));
		}
		return tasksModel;
	}

	/**
	 * implementación para añadir tareas
	 *
	 */
	@Override
	public TaskModel addTask(TaskModel taskModel) {
		Task task = taskRepo.save(taskConverter.taskmodel2task(taskModel));
		return taskConverter.task2taskmodel(task);
	}

	
	/**
	 * implementación para borrar, 
	 * primero busco el id que quiero borrar
	 *
	 */
	
	@Override
	public Task findTaskById(int id) {
		return taskRepo.findById(id);
	}


	@Override
	public void removeTask(int id) {
		Task task = findTaskById(id);
		if(task != null) {
			taskRepo.delete(findTaskById(id));	
		}
	}
	
	/**
	 * implementación para cambiar de estado
	 *
	 */
	@Override
	public void changeStatus(int id) {
		Task task = findTaskById(id);
		
			if (task.getStatus() == 0) {
			task.setStatus(Status.DONE.getId());
		} else
			task.setStatus(Status.PENDING.getId());
	}

	/**
	 * implementación para realizar modificaciones,  
	 * en este caso para modificar estado
	 *
	 */
	@Override
	public void update(Task task) {
		Task taskStatus = findTaskById(task.getId());
		if (taskStatus != null) {
			taskStatus.setId(task.getId());
			taskStatus.setName(task.getName());
			taskStatus.setStatus(task.getStatus());
		}
		
		taskRepo.save(taskStatus);
		
	}

	

}
