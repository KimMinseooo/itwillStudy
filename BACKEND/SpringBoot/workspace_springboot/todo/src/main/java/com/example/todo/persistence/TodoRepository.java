package com.example.todo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.todo.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String>{
	
	// userId로 1건 찾기 무조건 userId 동일하게 작성
	// 내가 원하는 쿼리 작성가능
	// 단, 메서드이름이 Entity의 멤버변수명과 같아야 인식!
	List<TodoEntity> findByUserId(String userId);
	
	// @Query를 활용해 직접 쿼리작성도 가능 
	@Query(value = "select * from Todo where userId =?1", nativeQuery = true)
	List<TodoEntity> findByuserIdQuery(String userId);
	
}
