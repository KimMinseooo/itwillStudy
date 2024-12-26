package com.itwillbs.test3_mybatis.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductVO {
	private String product_id;
	private String product_name;
	private String product_price;
	private String product_qty;
	private String product_img;
}
