package ro.ase.cts.g1099.clean.code.stage6;

import ro.ase.cts.g1099.clean.code.stage6.exceptions.MissingMarketingStrategyException;

// stage 6
public class DiscountStrategy {
	
	MarketingStrategy marketingStrategy;
	
	public float getDiscountValue(ProductType productType, float initialPrice) {
		return productType.getDiscount() * initialPrice;
	}
	
	public float getPriceWithDiscount(ProductType productType, float initialPrice) {
		return initialPrice - this.getDiscountValue(productType, initialPrice);
	}

	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) {
		
		if(this.marketingStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		
		float accountDiscount = (productType != ProductType.NEW) ? marketingStrategy.getAccountDiscount(accountAgeInYears) : 0;	
		float finalPrice = this.getPriceWithDiscount(productType, initialPrice) * (1 - accountAgeInYears);
	
		return finalPrice;
	}
}
