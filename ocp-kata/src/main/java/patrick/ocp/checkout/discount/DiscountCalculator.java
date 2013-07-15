package patrick.ocp.checkout.discount;

import static java.lang.Integer.valueOf;
import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DiscountCalculator {

	private static final Comparator<DiscountTracker> HIGHEST_DISCOUNT_FIRST = new Comparator<DiscountTracker>() {

		public int compare(DiscountTracker tracker, DiscountTracker anotherTracker) {
			return valueOf(anotherTracker.getDiscount().getSaving()).compareTo(tracker.getDiscount().getSaving());
		}
		
	};
	
	private List<DiscountTracker> discountTrackers = new ArrayList<DiscountTracker>();
	
	public void setDiscountByItemCodes(int discount, char... itemCodes) {
		discountTrackers.add(new DiscountTracker(new Discount(discount, itemCodes)));
	}

	public void scan(char itemCode) {
		Item item = new Item(itemCode);
		for (DiscountTracker discountTracker : discountTrackers) {
			discountTracker.offerForDiscount(item);
		}
	}

	public int getTotal() {
		int total = 0;
		sort(discountTrackers, HIGHEST_DISCOUNT_FIRST);
		for (DiscountTracker discountTracker : discountTrackers) {
			List<Discount> discounts = discountTracker.takeCompletedDiscounts();
			for (Discount discount : discounts) {
				total += discount.getSaving();
			}
		}
		return total;
	}

}
