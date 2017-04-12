package com.ddworld.todo.restservices;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ddworld.todo.beans.Task;

@RestController
public interface TaskService {
	
	@RequestMapping(value="/getalltasks", method=RequestMethod.GET)
	public List<Task> getAllTasks();
	
	@RequestMapping(value="/createtask", method=RequestMethod.POST)
	public Task createTask(@RequestBody Task task);

}
