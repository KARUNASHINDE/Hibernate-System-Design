package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
	ProductDao productdao = new ProductDao();

	public Product saveProduct(Product product) {
		return productdao.saveProduct(product);
	}

	public Product updateProduct(Product product, int id) {
		Product product2 = productdao.getProductById(id);
		if (product.getPname() != null)
			product2.setPname(product.getPname());
		if (product.getBrand() != null)
			product2.setBrand(product.getBrand());
		if (product.getColor() != null)
			product2.setColor(product.getColor());
		if (product2 != null)
			return productdao.updateProduct(product2);
		return null;
	}

	public Product getproductById(int id) {
		// TODO Auto-generated method stub
		return productdao.getProductById(id);
	}
	
	public Product deleteProduct(int id) {
	Product product=	productdao.getProductById(id);
		if(product!=null) {
			 return productdao.deleteProduct(product);
		}
		return null;
	}
	public void getAllProduct() {
		productdao.getAllProduct();
	}
	

}