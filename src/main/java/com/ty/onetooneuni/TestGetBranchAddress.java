package com.ty.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 2);
		if (branch != null) {
			System.out.println("-------------------------------");
			System.out.println("Branch Name is " + branch.getName());
			System.out.println("Branch Phone num is " + branch.getPhone());
			System.out.println("Branch Organisation Name " + branch.getOrganisationName());

			Addresss addresss = branch.getAddresss();
			System.out.println("-------------------------------");
			System.out.println("Street Num " + addresss.getStreetNum());
			System.out.println("Street Name is " + addresss.getStreet());
			System.out.println("Area is " + addresss.getArea());
			System.out.println("City is " + addresss.getCity());
			System.out.println("State is " + addresss.getState());
			System.out.println("Country is " + addresss.getCountry());
			System.out.println("Pincode is " + addresss.getPincode());
		} else {
			System.out.println("No Branch is exists for given Id");
		}

	}

}
