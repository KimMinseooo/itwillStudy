package com.example.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.TodoEntity;
import com.example.todo.persistence.TodoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService {
	
	@Autowired
	TodoRepository repository;
	
	public String testService() {
		
		TodoEntity entity = TodoEntity.builder().title("첫번째 Todo").build();
		repository.save(entity); // insert구문 작성할 필요 없음
		
//		TodoEntity savedEntity = repository.findById(entity.getId()).get();
		// => SELECT * FROM Todo WHERE id = "xxx" 가 실행된거랑 다름없음
//		return savedEntity.getTitle();
		
		List<TodoEntity> list = repository.findAll();
		return list.toString();
	}
}
