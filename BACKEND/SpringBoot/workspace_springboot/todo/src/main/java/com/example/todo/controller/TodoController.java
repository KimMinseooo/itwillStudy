package com.example.todo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.dto.ResponseDTO;
import com.example.todo.dto.TodoDTO;
import com.example.todo.model.TodoEntity;
import com.example.todo.service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {

	@Autowired
	TodoService service;
	
	@GetMapping("test")
	public ResponseEntity<?> testTodo() {
		String str = service.testService();
		List<String> list = new ArrayList();
		list.add(str);
		ResponseDTO<String> res = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(res);
	}
	
	// insert
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto) {
		String tempUserId = "temp-user";
		
		// dto -> entity
		TodoEntity entity = TodoDTO.toEntity(dto);
		entity.setUserId(tempUserId);
		
		List<TodoEntity> entities = service.create(entity);
		
		// stream을 활용하여 entity가 들어있는 list를 반복하면서 DTO객체를 생성
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		// 아래 코드를 람다식으로 표현
//		List<TodoDTO> dtos = new ArrayList<TodoDTO>();
//		for (TodoEntity ent : entities) {
//			dtos.add(new TodoDTO(entity));
//		}
		
		// dto를 json으로 변환한다
		ResponseDTO<TodoDTO> res = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		
		// select한 data와 header, status 등을 조작하기 위해 ResponseEntity로 최종 리턴
		return ResponseEntity.ok().body(res);
	}
	
	// select
	@GetMapping
	public ResponseEntity<?> retrieveTodoList() {
		String tempUserId = "temp-user";
		List<TodoEntity> entities = service.retrieve(tempUserId);
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		ResponseDTO<TodoDTO> res = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(res);
	}
	
	
	// update
	@PutMapping
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto) {
		String tempUserId = "temp-user";
		TodoEntity entity = TodoDTO.toEntity(dto);
		entity.setUserId(tempUserId);
		
		List<TodoEntity> entities = service.update(entity);
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		ResponseDTO<TodoDTO> res = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(res);
	}
	
	// delete
	@DeleteMapping
	public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto) {
		String tempUserId = "temp-user";
		TodoEntity entity  =TodoDTO.toEntity(dto);
		entity.setUserId(tempUserId);
		
		List<TodoEntity> entities = service.delete(entity);
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		ResponseDTO<TodoDTO> res = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(res);
	}
	
	
	
	
}
