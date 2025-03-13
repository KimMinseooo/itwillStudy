package com.example.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration	// 스프링 빈 등록
public class WebMvcConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 모든 경로에 대해 (/**)
		// Origin이 http://localhost:3000인 경우
		// GET, POST , PUT , PATCH , DELETE , OPTION 메서드를 이용한 요청을 허용한다.
		// 또한 모든 헤더와 인증에 관한 정보도 허용 allowCredentials(true)
		// 클라이언트가 응답을 캐시할 수 있는 시간 maxAge(3600)
		registry.addMapping("/**")
			.allowedOrigins("http://localhost:3000")
			.allowedMethods("GET","POST","PUT","PATCH","DELETE","OPTIONS")
			.allowedHeaders("*")
			.allowCredentials(true)
			.maxAge(3600);
	}
	
	
	
}
