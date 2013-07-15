package patrick.ocp.checkout.discount;


public class Discount {
	
	private char[] itemCodes;
	private int saving;

	public Discount(int saving, char... itemCodes) {
		this.saving = saving;
		this.itemCodes = itemCodes;
	}
	
	public char[] getItemCodes() {
		return itemCodes;
	}

	public int getSaving() {
		return saving;
	}
	
	public boolean containsItemCode(char itemCode) {
		return countOccurencesOfItemCode(itemCode) > 0;
	}

	public int countOccurencesOfItemCode(char itemCode) {
		int count = 0;
		for (char code : itemCodes) {
			if (code == itemCode) {
				count++;
			}
		}
		return count;
	}
	
}
