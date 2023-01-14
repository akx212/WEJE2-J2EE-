package com.jspiders.designpatterntask.singletonBank;

public class Account {
	static Account account = new Account(10000);
	static long accountBalance;

	private Account(long accountBalance) {
		Account.accountBalance = accountBalance;
	}
	public static long getAccountBalance() {
		return accountBalance;
	}
}
