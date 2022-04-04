package ro.ase.cts.g1099.clean.code.stage6;

public class MarketingStrategy {
	
	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT
				: (float) accountAgeInYears / 100;
	}

}
