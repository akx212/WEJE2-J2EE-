package com.jspiders.designpatterntask.singletonBank;

public class Withdraw {
	static Withdraw withdrow;
	static long withdrowAmmount;

	private Withdraw(long withdrowAmount) {
		Withdraw.withdrowAmmount = withdrowAmount;
	}

	public static Withdraw getWithdrowAmount(long withdrowAmount) {
		
		System.out.println("Your Withdrow amount is = "+withdrowAmount+" Rs.");
		System.out.println("Please wait...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				if (withdrow == null) {
			withdrow = new Withdraw(withdrowAmount);
		}
		if (Account.accountBalance < withdrowAmount) {
			System.out.println("Sorry!! Balance is insufficient");
			return withdrow;
		}
		Account.accountBalance -= withdrowAmount;
		System.out.println(withdrowAmount + " Rs. Withdrow Successfully ");
		return withdrow;
	}
}
