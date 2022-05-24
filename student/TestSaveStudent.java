package com.ty.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	 public static void main(String[] args) {
		
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTranscation = entityManager.getTransaction();
		 
		 Student student = new Student();
		 student.setId(3);
		 student.setName("Nuthan");
		 student.setPercentage(48.01);
		 
		 entityTranscation.begin();
		 
		 entityManager.persist(student);
		 
		 entityTranscation.commit();
		 
		 System.out.println("----------Done----------");
	}
}
