package patrick.ocp.checkout.discount;

import java.util.ArrayList;
import java.util.List;

public class DiscountTracker {

	private Discount discount;
	private List<Item> offeredForDiscount = new ArrayList<Item>();
	
	public DiscountTracker(Discount discount) {
		this.discount = discount;
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void offerForDiscount(Item item) {
		if (discount.containsItemCode(item.getCode())) {
			offeredForDiscount.add(item);
		}
	}

	public List<Discount> takeCompletedDiscounts() {
		List<Discount> completedDiscounts = new ArrayList<Discount>();
		boolean canFindMoreDiscounts = true;
		while (canFindMoreDiscounts) {
			PotentialDiscount potentialDiscount = new PotentialDiscount(discount);
			potentialDiscount.addAvailableItems(offeredForDiscount);
			if (potentialDiscount.isComplete()) {
				potentialDiscount.takeItems();
				completedDiscounts.add(discount);
			} else {
				canFindMoreDiscounts = false;
			}
		}
		return completedDiscounts;
	}
	
}
