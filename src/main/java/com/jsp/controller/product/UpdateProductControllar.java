package com.jsp.controller.product;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class UpdateProductControllar {
	public static void main(String[] args) {
		
		Product product= new Product();
		product.setBrand("kkk");
		product.setColor("black");
		product.setPname("rice");
		
		ProductService productservice = new ProductService();
		Product product2= productservice.updateProduct(product, 1);
		if(product2!=null) {
			System.out.println("product is updated");
		}
	}

}
