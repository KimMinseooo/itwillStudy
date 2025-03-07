package com.example.todo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class TodoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
//	@GenericGenerator(name = "system-uuid", strategy ="uuid")
	private String id;		// 해당 오브젝트의 아이디 (uuid)
	private String userId;  // 오브젝트를 생성한 유저 아이디 (회원아이디)
	private String title;   // Todo 타이틀 예) "운동하기"
	private boolean done;   // checkbox의 값 (true/false) 
}
