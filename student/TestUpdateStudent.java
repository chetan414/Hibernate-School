package com.ty.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransacation = entityManager.getTransaction();

		Student student = new Student();
		student.setId(3);
		student.setName("Nuthan");
		student.setPercentage(48.93);

		entityTransacation.begin();
		entityManager.merge(student);
		entityTransacation.commit();
	}
}
