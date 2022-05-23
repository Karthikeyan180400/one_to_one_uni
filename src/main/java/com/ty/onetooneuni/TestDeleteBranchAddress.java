package com.ty.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class, 3);
		if (branch != null) {
			Addresss addresss = branch.getAddresss();

			entityTransaction.begin();
			entityManager.remove(addresss);
			entityManager.remove(branch);
			entityTransaction.commit();
		} else {
			System.out.println("No Data is exists for given Id to Delete");
		}

	}

}
