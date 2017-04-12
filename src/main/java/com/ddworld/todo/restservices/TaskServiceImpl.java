package com.ddworld.todo.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ddworld.todo.beans.Task;
import com.ddworld.todo.repository.TaskRepositoryMongo;

@RestController
public class TaskServiceImpl implements TaskService{

	@Autowired
	TaskRepositoryMongo repository;
	
	@Override
	public List<Task> getAllTasks() {
		return repository.findAll();
	}

	@Override
	public Task createTask(@RequestBody Task task) {
		return repository.save(task);
	}

	@Override
	public List<Task> getTask( @PathVariable("field") String field, @PathVariable("value") String value) {
		
		List<Task> findTasks=new ArrayList<Task>();
		
		switch (field.toUpperCase()){
			case "ID":
				findTasks.add(repository.findOne(value));
				
				break;
			case "STATUS":
				findTasks = repository.findByStatus(value);
				break;
			case "OWNER":
				findTasks = repository.findByOwner(value);
				break;
			case "PRIORITY":
				findTasks = repository.findByPriority(value);
				break;
			default:
				
		}
		return findTasks;
	}

	@Override
	public Task updateTask(@RequestBody Task task) {
		
		return repository.save(task);
	}

	@Override
	public String deleteTask( @PathVariable("field") String field, @PathVariable("value") String value) {
		
		List<Task> findTasks=new ArrayList<Task>();
		
		switch (field.toUpperCase()){
			case "ID":
				findTasks.add(repository.findOne(value));
				break;
			case "STATUS":
				findTasks = repository.findByStatus(value);
				break;
			case "OWNER":
				findTasks = repository.findByOwner(value);
				break;
			case "PRIORITY":
				findTasks = repository.findByPriority(value);
				break;
			default:
				
		}
		repository.delete(findTasks);
		return null;
	}

	
}
