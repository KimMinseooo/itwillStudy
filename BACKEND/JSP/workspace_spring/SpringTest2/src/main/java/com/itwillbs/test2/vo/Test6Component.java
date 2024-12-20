package com.itwillbs.test2.vo;

import org.springframework.stereotype.Component;

@Component
public class Test6Component {
	
	public Test6Component() {
		System.out.println("Test6Component 기본 생성자 호출됨!");
	}
	
	public void componentMethod() {
		System.out.println("componentMethod() 메서드 호출됨!");
	}
}
