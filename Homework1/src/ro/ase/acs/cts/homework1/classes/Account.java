package ro.ase.acs.cts.homework1.classes;

import ro.ase.acs.cts.homework1.exceptions.MissingLoanValueException;
import ro.ase.acs.cts.homework1.interfaces.AccountFunctionsInterface;

public class Account {
	public double loanValue, rate;
	public int daysActive;
	public AccountType accountType;
	public static AccountFunctionsInterface accountFunctions;

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return this.loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + this.rate);
		return this.rate;
	}

	public double getMonthlyRate() {
		double monthlyRate = accountFunctions.getMonthlyRate(this.loanValue, this.rate);
		return monthlyRate;
	}

	public void setValue(double loanValue) {
		if (loanValue < 0)
			throw new MissingLoanValueException();

		this.loanValue = loanValue;
	}

	public static void setAccountFunctions(AccountFunctionsInterface accountFunctions) {
		Account.accountFunctions = accountFunctions;
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + this.daysActive + "; Type: "
				+ this.accountType + ";";
	}

	public double getTotalFee(Account[] accounts) {
		double totalFee = accountFunctions.getTotalFee(accounts);

		return totalFee;
	}

	public Account(double loanValue, double rate, AccountType accountType) throws Exception {
		if (loanValue < 0)
			throw new MissingLoanValueException();

		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}

}
