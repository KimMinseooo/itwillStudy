package com.itwillbs.test3_mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itwillbs.test3_mybatis.vo.ProductVO;

public interface ProductMapper {

	//상품정보 등록
	int registProduct(ProductVO product);
	
	//상품 목록 조회
	<T> List<T> getProductList(Map<String,String>param);
	
//	List<ProductVO> getProductList(Map<String,String>param);
//	ProductVO getProductList(Map<String, String>param);

	//상품 상세정보
//	ProductVO getProductInfo(String product_id);
	
	//상품정보 삭제
	int productDelete(String product_id);
	
	//상품정보 수정
	int productModify(@Param("old_id") String old_id,@Param("product") ProductVO product);
//	int productModify(ProductVO product);
}
