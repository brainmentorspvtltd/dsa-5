package com.tcs.banking.loan.users;

import com.tcs.banking.loan.insurance.LifeInsurance;

public class Customer {
	protected int id;
	public String name;
	public static void main(String[] args) {
		LifeInsurance obj = new LifeInsurance();
		obj.showInsuranceDetails();
	}
}
