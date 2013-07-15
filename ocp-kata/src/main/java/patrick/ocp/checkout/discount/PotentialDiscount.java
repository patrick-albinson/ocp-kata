package patrick.ocp.checkout.discount;

import java.util.ArrayList;
import java.util.List;

public class PotentialDiscount {
	
	private List<Item> items = new ArrayList<Item>();
	private Discount discount;

	public PotentialDiscount(Discount discount) {
		this.discount = discount;
	}

	public boolean isComplete() {
		return items.size() == discount.getItemCodes().length && noItemsHaveBeenTakenForDiscount();
	}

	private boolean noItemsHaveBeenTakenForDiscount() {
		for (Item item : items) {
			if (item.isTakenForDiscount()) {
				return false;
			}
		}
		return true;
	}

	public void takeItems() {
		for (Item item : items) {
			item.setTakenForDiscount(true);
		}
	}
	
	private int countTotalNumberOfItemsWithCode(char itemCode) {
		int count = 0;
		for (Item item : items) {
			if (item.getCode() == itemCode) {
				count++;
			}
		}
		return count;
	}

	public boolean hasRoomFor(Item item) {
		return discount.countOccurencesOfItemCode(item.getCode()) > countTotalNumberOfItemsWithCode(item.getCode());
	}
	
	public void addAvailableItems(List<Item> items) {
		for (Item item : items) {
			if (item.isAvailableForDiscount() && hasRoomFor(item)) {
				this.items.add(item);
			}
		}
	}

}
