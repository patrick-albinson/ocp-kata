package patrick.ocp.checkout;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckoutTester {

	private static int price(String... items) {
		Checkout checkout = new CheckoutFactory().create();
		for (String item : items) {
			checkout.scan(item);
		}
		return checkout.total();
	}
	
	@Test
	public void emptyBasket() {
		assertEquals(0, price(""));
	}
	
	@Test
	public void singleItem() {
		assertEquals(50, price("A"));
		assertEquals(30, price("B"));
		assertEquals(20, price("C"));
		assertEquals(15, price("D"));
	}

	@Test
	public void threeAsGetTwentyPenceDiscount() {
		assertEquals(100, price("A", "A"));
	    assertEquals(130, price("A", "A", "A"));
	    assertEquals(180, price("A", "A", "A", "A"));
	}

	@Test
	public void twoBsGetFifteenPenceDiscount() {
		assertEquals(45, price("BB"));
	    assertEquals(175, price("ABABA"));
	    assertEquals(180, price("ACABDB"));
	}

	@Test
	public void starterMainAndEitherPuddingForEightyFive() {
		assertEquals(85, price("BDA"));
		assertEquals(135, price("AADC"));
		assertEquals(180, price("AABCA"));
	}
	
}
