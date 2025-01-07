package com.itwillbs.mvc_board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itwillbs.mvc_board.service.MemberService;
import com.itwillbs.mvc_board.vo.MemberVO;

// @RestController  // 해당 클래스의 모든 메서드에 @ResponseBody 가 적용됨
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("MemberJoin")
	public String MemberJoinForm() {
		return "member/member_join_form";
	}
	
	@PostMapping("MemberJoin")
	public String MemberJoin(MemberVO member) {
		System.out.println(member);
		int insertCnt = memberService.registMember(member);
		System.out.println("INSERT 결과 : " +insertCnt);
		return "";
	}
	
	@ResponseBody // 리턴되는 문자열이 데이터가 되도록 변경
	@GetMapping("checkId")
	public Map<String,String> checkId(@RequestParam Map<String,String> param) {
		System.out.println("Ajax 호출됨!!!");
//		System.out.println(member);
		System.out.println(param);
		
		// 자바스크립트 success에서 데이터를 사용하려면 json 형태인것인 편리하다.
		// 이때 , 가장 비슷한 Map을 리턴하더라도 자동 json으로 파싱이 불가능
		// pom.xml에 jackson 라이브러리를 추가하여 편리하게 json으로 파싱 가능
		// (부트에서는 디폴트로 jackson 추가되어있음)
		
		int cnt= memberService.checkId(param);
		Map<String,String> resultMap = new HashMap<String, String>();
		
		if( cnt == 0) {
			resultMap.put("msg", "사용 가능한 아이디!");
			resultMap.put("color", "blue");
		} else {
			resultMap.put("msg", "아이디 중복!");
			resultMap.put("color", "red");
		}
	
		
		
		return resultMap;
	}
}
