package com.example.todo.service;

import java.util.List;
import java.util.Optional;

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
		TodoEntity entity = TodoEntity.builder().title("두번째 Todo").userId("admin").build();
		repository.save(entity); // insert 구문 작성할 필요없음
		
//		TodoEntity savedEntity = repository.findById(entity.getId()).get();
		// => SELECT * FROM Todo WHERE id = "xxx" 가 실행된거랑 다름없음
//		return savedEntity.getTitle();
		
//		List<TodoEntity> list = repository.findAll();
//		return list.toString();
		
		List<TodoEntity> list = repository.findByUserId("admin");
		return list.toString();
	}
	
	// insert
	public List<TodoEntity> create(final TodoEntity entity) {
		repository.save(entity);
		return repository.findByUserId(entity.getUserId());
	}
	
	// select
	public List<TodoEntity> retrieve(final String userId) {
		return repository.findByUserId(userId);
	}
	
	// update
	public List<TodoEntity> update(final TodoEntity entity) {
		// DB에 있는 원본글을 가져온다.
		final Optional<TodoEntity> original = repository.findById(entity.getId());
		
		// 변경된 데이터 (entity)로 덮어 씌운다 (id,userId는 제외) 
		// Optional > ifPresent()를 사용하는 이유는 예외상황 (객체의 데이터가 null인 경우) 
		// 을 위해 if문을 작성하지 않아도 된다.
		// ifPresent() : 값을 가지고 있는지 확인 후 있으면 {} 안을 실행
		original.ifPresent(todo -> {
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());
			
			repository.save(todo);
		});
		
		return retrieve(entity.getUserId());
	}
	// delete
	public List<TodoEntity> delete (final TodoEntity entity) {
		repository.delete(entity);
		return retrieve(entity.getUserId());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
