package com.itwillbs.test2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itwillbs.test2.vo.PersonVO;
import com.itwillbs.test2.vo.TestVO;


@Controller
public class Test5Controller_MAV {

	/*
	 * [ ModelAndView 객체 ]
	 * - 데이터 저장 용도의 Model 객체와 뷰페이지 포워딩 정보를 함께 관리하는 객체
	 * - 매핑 메서드 정의 시 리턴타입을 ModelAndView 타입으로 지정 후 
	 *   return 문 뒤에 ModelAndView 객체를 리턴 
	 */
	
	
//	@GetMapping("mav")
//	public String getMav(Model model) {
//		
//		PersonVO person = new PersonVO("홍길동",20,"남");
//		model.addAttribute("person",person);
//		
//		return "test2/mav";
//	}
	//=================================
	// ModelAndView 타입 객체 활용하여 포워딩
	
	// 값을 여러개 넣는경우 ModelAndView 를 사용 !! Map을 활용하여!! 
	@GetMapping("mav")
	public ModelAndView getMav(Model model) {
		
		PersonVO person = new PersonVO("홍길동",20,"남");	
		TestVO test = new TestVO("제목", "내용");
		Map<String,Object>map  = new HashMap<String,Object>();
		map.put("person", person);
		map.put("test",test);
		
		ModelAndView mav = new ModelAndView("test2/mav",map);
		
//		ModelAndView mav = new ModelAndView("test2/mav","map",map);
		
		
		return mav;
	}
}
