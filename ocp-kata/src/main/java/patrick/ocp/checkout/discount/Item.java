package patrick.ocp.checkout.discount;

public class Item {

	private char code;
	private boolean takenForDiscount;
	
	public Item(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public boolean isTakenForDiscount() {
		return takenForDiscount;
	}
	
	public boolean isAvailableForDiscount() {
		return !takenForDiscount;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public void setTakenForDiscount(boolean takenForDiscount) {
		this.takenForDiscount = takenForDiscount;
	}
	
}
