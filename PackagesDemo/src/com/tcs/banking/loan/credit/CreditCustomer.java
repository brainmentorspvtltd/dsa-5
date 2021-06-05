package com.tcs.banking.loan.credit;

import com.tcs.banking.loan.users.Customer;

public class CreditCustomer extends Customer {
	void showCustomerDetails() {
		Customer obj = new Customer();
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+obj.name);
	}
}
