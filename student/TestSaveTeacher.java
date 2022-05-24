package com.ty.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setId(3);
		teacher.setName("Priya");
		teacher.setEmail("priya@gmail.com");
		teacher.setPhone("99876512345");
		teacher.setGender("F");
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		
		System.out.println("Data is inserted successfully");
		
	}
}
