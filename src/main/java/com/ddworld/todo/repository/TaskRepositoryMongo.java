package com.ddworld.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ddworld.todo.beans.Task;

public interface TaskRepositoryMongo extends MongoRepository<Task, String>{
	
	
}
