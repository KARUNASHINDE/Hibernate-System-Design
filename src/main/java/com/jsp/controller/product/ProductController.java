package com.jsp.controller.product;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		 Product product= new Product();
		 product.setPname("jjj");
		 product.setBrand("kk");
		 product.setColor("black");
		 
		ProductService productservice = new ProductService();
		Product p1 = productservice.saveProduct(product);
		System.out.println(p1.getPname());
		
	}

}
