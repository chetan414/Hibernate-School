package com.ty.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransacation = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, 3);

		if (student != null) {
			entityTransacation.begin();
			entityManager.remove(student);
			entityTransacation.commit();
			System.out.println("Data is removed successfully");
		} else {
			System.out.println("No data is found for the given Id");
		}
	}
}
