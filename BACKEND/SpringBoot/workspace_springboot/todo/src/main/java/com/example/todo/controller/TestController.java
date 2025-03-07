package com.example.todo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.dto.ResponseDTO;
import com.example.todo.dto.TestRequestBodyDTO;

@RestController
@RequestMapping("test")
public class TestController {
	
	// localhost:8080/test
	@GetMapping
	public String testController () {
		return "test";
	}
	// localhost:8080/test/testGetMapping
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "/testGetMapping 호출됨!";
	}
	
	// @Get @Post @Put @Delete 4가지 사용가능 (스프링 4.3 부터 지원 ) 
	// 4.3 이전 방식
	// @RequestMapping(value = "/경로" , method = RequestMethod.GET)
	// @RequestMapping(value = "/경로" , method = RequestMethod.POST)
	
	// 스프링 부트 3.2.x 이전 버전에서는 @PathVariable 어노테이션이 적용된 변수명과
	// @GetMapping("/{id}") id의 변수명이 같을 경우 파라미터 전달됨
	// 3.2.x 이후 버전부터는 name속성을 추가해야 전달됨 @PathVariable(name= "id")
	// localhost:8080/test/1234 호출 시 파라미터로 1234를 전달받을 수도 있다. 
	@GetMapping("/{id}")
	public String testControllerWithPathValue(@PathVariable(name="id", required = false) int id) {
		return "value:" + id ;
	}
	
	@GetMapping("testRequestParam")
	public String testControllerRequestParam(@RequestParam(name="id")int id ) {
		return "value: "+id;
	}
	
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO dto) {
		return "id: " +dto.getId() + ", message: "+ dto.getMessage();
	}
	
	// @RestController 구조를 살펴보면 (F3)
	// @Controller 와 @ResponseBody의 조합이고 
	// @Controller의 구조를 살펴보면 @Component를 사용하고 있다.
	// 즉, @Component로 클래스의 오브젝트 생성 > 다른 오브젝트들과 의존성 연결
	// @ResponseBody는 메서드가 리턴하는 것이 ResponseBody라는 뜻
	// => 정리하면 @Component가 오브젝트를 생성하고 @ResponseBody에 의해서 
	// 리턴할 데이터를 HttpResponse에 담아 반환하는데 이때, 생성된 오브젝트를 JSON형태로 바꿔준다. (jackson)
	// 오브젝트 -> JSON(또는 다른타입) 직렬화 (Serialization)
	// JSON(또는 다른타입) -> 오브젝트 역직렬화(Deserialization)
	@GetMapping("/testResponseBody")
	public ResponseDTO<String> testControllerResponseBody() {
		List<String> list = new ArrayList<String>();
		list.add("객체 리턴 테스트");
		return ResponseDTO.<String>builder()
						  .data(list)
						  .build();
		
		// => Builder 패턴으로 데이터 생성한 후 data()에 JSON형태로 변환할 데이터 전달하여 
		//	  최종적으로 JSON 형태가 리턴됨
	}
	
	// ResponseEntity 타입으로 변환
	// => 응답데이터 뿐만 아니라 status, header를 조작하고 싶을때 사용
	@GetMapping("/testResponseEntity")
	public ResponseEntity<?> testControllerResponseEntity() {
		List<String> list = new ArrayList<String>();
		list.add("ResponseEntity 리턴 테스트");
		ResponseDTO<String> res = ResponseDTO.<String>builder().data(list).build();
		
//		return ResponseEntity.badRequest().body(res);
		return ResponseEntity.ok(res);
	}
	
}
