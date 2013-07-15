package patrick.ocp.checkout;

import java.util.HashMap;
import java.util.Map;

public class PriceCalculator {

	private Map<Character, Integer> prices = new HashMap<Character, Integer>();
	private int total = 0;

	private int getPriceByItemCode(char itemCode) {
		return prices.get(itemCode);
	}

	public int getTotal() {
		return total;
	}

	public void scan(char itemCode) {
		total += getPriceByItemCode(itemCode);
	}

	public void setPriceByItemCode(int price, char itemCode) {
		prices.put(Character.valueOf(itemCode), Integer.valueOf(price));
	}

}
