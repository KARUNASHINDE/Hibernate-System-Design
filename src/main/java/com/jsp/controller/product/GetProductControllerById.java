package com.jsp.controller.product;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetProductControllerById {
public static void main(String[] args) {
	ProductService productservice = new ProductService();
	Product p1= productservice.getproductById(1);
	System.out.println(p1.getPname());
}
}
