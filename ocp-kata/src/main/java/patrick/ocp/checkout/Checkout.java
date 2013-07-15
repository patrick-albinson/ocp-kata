package patrick.ocp.checkout;

import patrick.ocp.checkout.discount.DiscountCalculator;


public class Checkout {
	
	private PriceCalculator priceCalculator;
	private DiscountCalculator discountCalculator;

	public void scan(String item) {
		for (char itemCode : item.toCharArray()) {
			priceCalculator.scan(itemCode);
			discountCalculator.scan(itemCode);
		}
	}

	public int total() {
		int totalBeforeDiscount = priceCalculator.getTotal();
		int discount = discountCalculator.getTotal();
		return totalBeforeDiscount - discount;
	}

	public void setPriceCalculator(PriceCalculator priceList) {
		this.priceCalculator = priceList;
	}

	public void setDiscountCalculator(DiscountCalculator discountCalculator) {
		this.discountCalculator = discountCalculator;
	}

}
