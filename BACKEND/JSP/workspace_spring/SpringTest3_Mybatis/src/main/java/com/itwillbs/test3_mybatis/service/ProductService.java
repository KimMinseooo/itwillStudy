package com.itwillbs.test3_mybatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.test3_mybatis.mapper.ProductMapper;
import com.itwillbs.test3_mybatis.vo.ProductVO;

@Service
public class ProductService {

	
	@Autowired
	ProductMapper mapper;
	
	public int registProduct(ProductVO product) {
		return mapper.registProduct(product);
	}

	public <T> List<T> getProductList(Map<String,String> param) {
		return mapper.getProductList(param);
	}
	
	// 상품목록 조회
//	public List<ProductVO> getProductList(Map<String,String> param) {
//		return mapper.getProductList(param);
//	}
	// 메서드 오버로딩으로 메서드명이 같아도 가능
//	public ProductVO getProductList(Map<String,String> param) {
//		return mapper.getProductList(param);
//	}

//	public ProductVO getProductInfo(String product_id) {
//		return mapper.getProductInfo(product_id);
//	}

	public int productDelete(String product_id) {
		return mapper.productDelete(product_id);
	}

	public int productModify(String old_id,ProductVO product) {
		return mapper.productModify(old_id,product);
//		return mapper.productModify(product);
	}
}
