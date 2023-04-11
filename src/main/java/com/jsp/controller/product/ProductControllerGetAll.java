package com.jsp.controller.product;

import com.jsp.service.ProductService;

public class ProductControllerGetAll {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.getAllProduct();
	}

}
