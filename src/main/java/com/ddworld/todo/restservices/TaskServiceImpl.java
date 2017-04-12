package com.ddworld.todo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
