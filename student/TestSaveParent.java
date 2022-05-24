package com.ty.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTranscation = entityManager.getTransaction();

		Parent parent = new Parent();
		parent.setName("Sahana");
		parent.setEmail("sahana@gmail.com");
		parent.setPhone("7259921404");

		entityTranscation.begin();
		entityManager.persist(parent);
		entityTranscation.commit();
		System.out.println("Data is inserted successfully");
	}
}
