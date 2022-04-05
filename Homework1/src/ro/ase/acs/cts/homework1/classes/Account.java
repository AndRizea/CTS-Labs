package ro.ase.acs.cts.homework1.classes;

import ro.ase.acs.cts.homework1.exceptions.InappropriateValueException;
import ro.ase.acs.cts.homework1.exceptions.MissingLoanValueException;
import ro.ase.acs.cts.homework1.interfaces.AccountFunctionsInterface;

public class Account {
	private double loanValue, rate;
	private int daysActive;
	private AccountType accountType;
	private static AccountFunctionsInterface accountFunctions;

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return this.loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + this.rate);
		return this.rate;
	}

	public void setRate(double rate) {
		if (rate < 0)
			throw new InappropriateValueException();

		this.rate = rate;
	}

	public static AccountFunctionsInterface getAccountFunctions() {
		return accountFunctions;
	}

	public int getDaysActive() {
		return daysActive;
	}

	public void setDaysActive(int daysActive) {
		if (daysActive < 0)
			throw new InappropriateValueException();

		this.daysActive = daysActive;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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
		if (accountFunctions == null)
			throw new InappropriateValueException();

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

	public Account(double loanValue, double rate, AccountType accountType) {
		if (loanValue < 0)
			throw new MissingLoanValueException();

		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}

}
