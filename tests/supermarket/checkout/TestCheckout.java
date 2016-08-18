package supermarket.checkout;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import supermarket.item.Apple;
import supermarket.item.Item;
import supermarket.item.Orange;
import supermarket.checkout.Checkout;

/**
 * Test adding list of shopping items.
 * @author louistaub
 *
 */
public class TestCheckout {

	@Test
	/** Test, set apples to 60p and oranges to 25p.
		Assert that 3 oranges and 2 apples = £1.95
	*/
	public void test() {
		Orange orange = new Orange(new BigDecimal(0.25D));
		Apple apple = new Apple(new BigDecimal(0.6D));
		
		List<Item> shoppingBasket = new ArrayList<>();
		
		shoppingBasket.add(orange);
		shoppingBasket.add(apple);
		shoppingBasket.add(apple);
		shoppingBasket.add(orange);
		shoppingBasket.add(orange);
		BigDecimal shoppingBasketTotal = Checkout.getItemsTotal(shoppingBasket);
		assertEquals("Shopping basket total not match expected result: ",
				new BigDecimal(1.95D).setScale(2, BigDecimal.ROUND_UP),
				shoppingBasketTotal.setScale(2, BigDecimal.ROUND_UP));
	}

}
