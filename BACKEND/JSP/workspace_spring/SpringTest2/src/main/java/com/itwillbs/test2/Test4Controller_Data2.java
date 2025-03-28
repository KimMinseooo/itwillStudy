package com.itwillbs.test2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test4Controller_Data2 {
	@GetMapping("data_process3")
	public String data_process3(@RequestParam Map<String,String>map, Model model) {
		
		System.out.println(map);
		
		// Map 내의 각 파라미터를 별도로 접근하여 출력 - get() 메서드 활용
		model.addAttribute("map", map);
		model.addAttribute("board_num", map.get("board_num"));
		model.addAttribute("pageNum", map.get("pageNum"));		
		return "test2/data_result2";
	}
}
