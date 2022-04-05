package ro.ase.acs.cts.homework1.classes;

import ro.ase.acs.cts.homework1.interfaces.AccountFunctionsInterface;

public class AccountFunctions implements AccountFunctionsInterface {
	
	public static final float BROKER_FEE = 0.0125f;
	public static final int DAYS_IN_A_YEAR = 365;
	
	@Override
	public double getTotalFee(Account[] accounts)  {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE
						* (account.loanValue * Math.pow(account.rate, (account.daysActive / DAYS_IN_A_YEAR))
								- account.loanValue); // interest-principal
		}
		return totalFee;
	}

	@Override
	public double getMonthlyRate(double loanValue, double rate) {
		return loanValue * rate;
	}

}
