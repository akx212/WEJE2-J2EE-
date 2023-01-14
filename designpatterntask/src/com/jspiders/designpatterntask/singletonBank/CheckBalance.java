package com.jspiders.designpatterntask.singletonBank;

public class CheckBalance {
	static CheckBalance checkBalance;

	public static long getCheckBalance() {
		if (checkBalance == null) {
			checkBalance = new CheckBalance();
		}
		System.out.print("Your Available Balance is = ");
		return Account.accountBalance;
	}
}
