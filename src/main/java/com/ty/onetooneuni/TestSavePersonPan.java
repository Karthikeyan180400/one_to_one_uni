package com.ty.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Nishanth");
		person.setEmail("nishanth@email.com");
		person.setPhone(80087777);
		
		Pan pan = new Pan();
		pan.setName("Nishanth K");
		pan.setPanNumber("FOPTY7TH");
		pan.setAddress("10th cross Marathahalli");
		
		person.setPan(pan);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
