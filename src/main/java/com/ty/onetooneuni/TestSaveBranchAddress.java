package com.ty.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = new Branch();
		branch.setName("West York branch");
		branch.setOrganisationName("KS Hospital");
		branch.setPhone(11111177);

		Addresss addresss = new Addresss();
		addresss.setStreetNum("11th cross");
		addresss.setStreet("York Street");
		addresss.setArea("RomYork");
		addresss.setCity("NewRom");
		addresss.setState("NewYork");
		addresss.setCountry("USA");
		addresss.setPincode(151117);
		branch.setAddresss(addresss);

		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(addresss);
		entityTransaction.commit();

	}

}
