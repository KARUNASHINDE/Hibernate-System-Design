package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		
		if(product!=null) {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return product;
		}
		else {
			return null;
		
		}
	}
	
	public  Product getProductById(int id) {
		if(id>0) {
			return entityManager.find(Product.class, id);
				 		
			}
		else {
			return null;
		}
	}
	
	public Product updateProduct(Product product) {
		if(product!=null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;
			
		}
		return null;
	}
	

	public Product deleteProduct(Product product) {
		if(product !=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return product;
		}
		else {
			return null;
		}
		
	}
	
	public void getAllProduct() {
		String sql = "select s from Product s";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		for(Product product : products) {
			System.out.println(product.getProductId());
			System.out.println(product.getBrand());
			System.out.println(product.getColor());
			System.out.println("==================================================");
			
		}
	}
}

	
	


