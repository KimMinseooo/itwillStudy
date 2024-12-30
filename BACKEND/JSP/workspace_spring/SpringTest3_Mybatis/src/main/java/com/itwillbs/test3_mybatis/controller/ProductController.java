package com.itwillbs.test3_mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwillbs.test3_mybatis.service.ProductService;
import com.itwillbs.test3_mybatis.vo.ProductVO;

@Controller
public class ProductController {

	
	@Autowired
	ProductService service;
	
	@GetMapping("registProduct")
	public String registProductForm() {
		
		return "product/product_regist_form";
	}
	
	@PostMapping("registProduct")
	public String registProduct(ProductVO product) {
	
		System.out.println("전달받은 상품번호 :"+product.getProduct_id());
		System.out.println("전달받은 상품명 :"+product.getProduct_name());
		System.out.println("전달받은 가격 :"+product.getProduct_price());
		System.out.println("전달받은 수량 :"+product.getProduct_qty());
		System.out.println("전달받은 이미지 : "+product.getProduct_img());
		int registCount = service.registProduct(product);
		System.out.println("INSERT 작업 결과 :"+ registCount);
		
		return "redirect:productList";
	}
	
	@GetMapping("productList")
	public String getProductList(@RequestParam Map<String, String> param,Model model) {
		
		System.out.println(param);
		
		List<ProductVO> productList= service.getProductList(param);
		System.out.println(productList);
		model.addAttribute("productList",productList);
		
		return "product/product_list";
	}
	
	@GetMapping("productInfo")
	public String getProductInfo(@RequestParam Map<String,String> param,Model model) {
//		System.out.println("전달받은 : "+ product_id);
//		ProductVO product = service.getProductList(product_id);
		List<ProductVO> list = service.getProductList(param);
		model.addAttribute("product",list.get(0));
		return "product/product_info";
	}
	
	@GetMapping("productDelete")
	public String productDelete(String product_id) {
		System.out.println("전달받은 상품번호 :"+product_id);
		int deleteCount = service.productDelete(product_id);
		System.out.println("DELETE 실행 결과 :"+deleteCount);
		return "redirect:productList";
	}
	
	
	@GetMapping("productModify")
	public String productModifyForm(@RequestParam Map<String,String>param,Model model) {
//		System.out.println("전달받은 product_id :"+product_id);
		List<ProductVO> list = service.getProductList(param);
		model.addAttribute("product",list);
		return "product/product_modify_form";
	}
	
	@PostMapping("productModify")
	public String productModify(String old_id,ProductVO product,Model model) {
//		System.out.println("전달받은 product_id :"+product_id+" Product "+product);
		System.out.println("전달받은 old_id : "+old_id+" product :"+product);
		int updateCount = service.productModify(old_id,product);
//		int updateCount = service.productModify(product);
		System.out.println("update 실행결과 : "+updateCount);
		model.addAttribute("product_id",product.getProduct_id());
		return "redirect:productInfo";
	}
}
