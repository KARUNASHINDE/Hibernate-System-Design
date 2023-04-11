package com.jsp.controller.product;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductControllerDelete {

	public static void main(String[] args) {
      ProductService productService = new ProductService();
     Product product= productService.deleteProduct(2);
     if(product!=null) {
    	 System.out.println("record deleted");
     }
      
	}

}
