package com.example.todo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Todo")
public class TodoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
//	@GenericGenerator(name = "system-uuid", strategy ="uuid")
	private String id;		// 해당 오브젝트의 아이디 (uuid)
	private String userId;  // 오브젝트를 생성한 유저 아이디 (회원아이디)
	private String title;   // Todo 타이틀 예) "운동하기"
	private boolean done;   // checkbox의 값 (true/false) 
}
//	1. @Table(name = "Todo"): Todo는 테이블명
//	   @Table을 추가하지 않으면 @Entity("테이블명")
//	   @Entity("테이블명")




