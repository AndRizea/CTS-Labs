package ro.ase.acs.cts.homework1.classes;

import ro.ase.acs.cts.homework1.interfaces.AccountFunctionsInterface;

public class AccountFunctions implements AccountFunctionsInterface {

	public static final float BROKER_FEE = 0.0125f;
	public static final int DAYS_IN_A_YEAR = 365;

	@Override
	public double getTotalFee(Account[] accounts) {
		double totalFee = 0.0;
		for (Account account : accounts) {
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE
						* this.getAccountFeeRate(account.loanValue, account.rate, account.daysActive, DAYS_IN_A_YEAR);
		}
		return totalFee;
	}

	@Override
	public double getMonthlyRate(double loanValue, double rate) {
		return loanValue * rate;
	}

	public double getActiveDaysRatio(int activeDays, int daysInAYear) {
		double activeDaysRatio = activeDays / daysInAYear;

		return activeDaysRatio;
	}

	public double getFeeRate(double rate, int activeDays, int daysInAYear) {
		double totalFeeRate = Math.pow(rate, this.getActiveDaysRatio(activeDays, daysInAYear));

		return totalFeeRate;
	}

	public double getAccountFeeRate(double loanValue, double rate, int activeDays, int daysInAYear) {
		double accountFeeRate = loanValue * (this.getFeeRate(rate, activeDays, daysInAYear) - 1);

		return accountFeeRate;
	}

}
