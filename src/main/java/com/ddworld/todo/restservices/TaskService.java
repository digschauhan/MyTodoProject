package com.ddworld.todo.restservices;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ddworld.todo.beans.Task;


public interface TaskService {
	
	@RequestMapping(value="/getalltasks", method=RequestMethod.GET)
	public List<Task> getAllTasks();
	
	@RequestMapping(value="/createtask", method=RequestMethod.POST)
	public Task createTask(@RequestBody Task task);
	
	@RequestMapping(value="/gettask/{field}/{value}", method=RequestMethod.GET)
	public List<Task> getTask( @PathVariable("field") String field, @PathVariable("value") String value);
	
	
	@RequestMapping(value="/updatetask", method=RequestMethod.POST)
	public Task updateTask(@RequestBody Task task);

	
	@RequestMapping(value="/deletetask/{field}/{value}", method=RequestMethod.DELETE)
	public String deleteTask( @PathVariable("field") String field, @PathVariable("value") String value);

}
