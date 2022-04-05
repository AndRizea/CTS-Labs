package ro.ase.acs.cts.homework1.classes;

import ro.ase.acs.cts.homework1.interfaces.AccountFunctionsInterface;

public class Account {
	public double loanValue, rate;
	public int daysActive;
	public AccountType accountType;
	public static AccountFunctionsInterface accountFunctions;

	public double loan() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}

	public double getMonthlyRate() {
		double monthlyRate = accountFunctions.getMonthlyRate(this.loanValue, this.rate);
		return monthlyRate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
	}

	public static void setAccountFunctions(AccountFunctionsInterface accountFunctions) {
		Account.accountFunctions = accountFunctions;
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public double getTotalFee(Account[] accounts) {
		double totalFee = accountFunctions.getTotalFee(accounts);

		return totalFee;
	}

	public Account(double value, double rate, AccountType accountType) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}

}
