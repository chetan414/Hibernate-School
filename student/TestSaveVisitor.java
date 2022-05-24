package com.ty.student;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Visitor visitor = new Visitor();
		visitor.setId(3);
		visitor.setName("Pragz");
		visitor.setEmail("pragz@gmail.com");
		visitor.setGender("Female");
		visitor.setDob(LocalDate.of(1999, 02, 05));
		visitor.setVisitDatetime(LocalDateTime.now());
		
		entityTransaction.begin();
		entityManager.persist(visitor);
		entityTransaction.commit();
		
		System.out.println("---------------Done-----------------");
		
	}
}
