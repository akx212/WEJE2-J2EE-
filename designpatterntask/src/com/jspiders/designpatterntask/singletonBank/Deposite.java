package com.jspiders.designpatterntask.singletonBank;

public class Deposite {
	static Deposite deposite;
	static long depositeAmount;

	private Deposite(long depositeAmount) {
		Deposite.depositeAmount = depositeAmount;
	}

	public static void getDepositeAmount(long depositeAmount) {
		System.out.println("Your Deposite amount is = "+depositeAmount+" Rs.");
		if (deposite == null) {
			deposite = new Deposite(depositeAmount);
		}
		Account.accountBalance += depositeAmount;
		System.out.println(depositeAmount + " Rs Successfully Deposite ");
	}

}
