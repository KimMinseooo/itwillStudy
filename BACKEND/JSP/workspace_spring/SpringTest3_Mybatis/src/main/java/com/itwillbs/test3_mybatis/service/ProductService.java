package com.itwillbs.test3_mybatis.service;

import java.util.List;

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

	public List<ProductVO> getProductList() {
		return mapper.getProductList();
	}

	public ProductVO getProductInfo(String product_id) {
		return mapper.getProductInfo(product_id);
	}

	public int productDelete(String product_id) {
		return mapper.productDelete(product_id);
	}

	public int productModify(String old_id,ProductVO product) {
		return mapper.productModify(old_id,product);
//		return mapper.productModify(product);
	}
}
