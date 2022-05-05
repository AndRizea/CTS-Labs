package ro.ase.acs.cts.homework1.interfaces;

import ro.ase.acs.cts.homework1.classes.Account;

public interface AccountFunctionsInterface {
	
	public abstract double computeTotalFee(Account[] accounts);
	public abstract double getMonthlyRate(double loanValue, double rate);

}
