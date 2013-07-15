package patrick.ocp.checkout;

import patrick.ocp.checkout.discount.DiscountCalculator;

public class CheckoutFactory {

	public Checkout create() {
		Checkout checkout = new Checkout();
		checkout.setPriceCalculator(createPriceCalculator());
		checkout.setDiscountCalculator(createDiscountCalculator());
		return checkout;
	}

	private DiscountCalculator createDiscountCalculator() {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		discountCalculator.setDiscountByItemCodes(20, 'A', 'A', 'A');
		discountCalculator.setDiscountByItemCodes(15, 'B', 'B');
		discountCalculator.setDiscountByItemCodes(15, 'A', 'B', 'C');
		discountCalculator.setDiscountByItemCodes(10, 'A', 'B', 'D');
		return discountCalculator;
	}

	private PriceCalculator createPriceCalculator() {
		PriceCalculator priceCalculator = new PriceCalculator();
		priceCalculator.setPriceByItemCode(50, 'A');
		priceCalculator.setPriceByItemCode(30, 'B');
		priceCalculator.setPriceByItemCode(20, 'C');
		priceCalculator.setPriceByItemCode(15, 'D');
		return priceCalculator;
	}

}
