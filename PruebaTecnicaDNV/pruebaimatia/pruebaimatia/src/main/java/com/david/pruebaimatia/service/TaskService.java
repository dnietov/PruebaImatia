/*
 * David Nieto Velasco
 * 02-may-2019
 */
package com.david.pruebaimatia.service;

import java.util.List;

import com.david.pruebaimatia.entity.Task;
import com.david.pruebaimatia.model.TaskModel;

/**
 * The Interface TaskService.
 */
public interface TaskService {
	
	//método para obtener listado de tareas
	public abstract List<TaskModel> listAllTasks();
	
	//método para añadir un tarea, devuelve un modelo
	public abstract TaskModel addTask(TaskModel taskModel);
	
	//método para eliminar una tarea
	public abstract Task findTaskById(int id);
	
	public abstract void removeTask (int id);
	
	//método para cambiar el estado de la tarea
	public abstract void changeStatus (int id);
	
	//método para modificar una tarea
	public abstract  void update (Task task);

}
