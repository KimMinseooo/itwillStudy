package com.example.todo.dto;

import com.example.todo.model.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// id(pk), userId(회원아이디), title(나의할일 제목), done(여부) 

// DTO는 클라이언트(사용자)에게 DB구조를 숨기고 실제로 "보여주기"위한 데이터를 담는 용도
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
	private String id;		// 해당 오브젝트의 아이디 (uuid)
	private String title;   // Todo 타이틀 예) "운동하기"
	private boolean done;   // checkbox의 값 (true/false) 
	
	// DB에서 select 해온 데이터(Entity) 중
	// 사용자에게 보여줄 데이터만 추출해서 저장하는 생성자 작성
	public  TodoDTO(TodoEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	
	// dto-> entity 로 변환
	public static TodoEntity toEntity(TodoDTO dto) {
		return TodoEntity.builder()
						 .id(dto.getId())
						 .title(dto.getTitle())
						 .done(dto.isDone())
						 .build();
	}
}
