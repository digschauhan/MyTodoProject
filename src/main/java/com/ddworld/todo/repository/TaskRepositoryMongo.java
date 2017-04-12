package com.ddworld.todo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ddworld.todo.beans.Task;

public interface TaskRepositoryMongo extends MongoRepository<Task, String>{
	
	//public Task findById(String id);
	public List<Task> findByStatus(String status);
	public List<Task> findByOwner(String owner);
	public List<Task> findByPriority(String priority);
	
}
