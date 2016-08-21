package supermarket.checkout;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import supermarket.item.Apple;
import supermarket.item.Item;
import supermarket.item.ItemType;
import supermarket.item.Orange;
import supermarket.item.promo.PromotionType;

/**
 * Test adding list of shopping items.
 * 
 * @author Louis Taub
 *
 */
public class TestCheckout {

	@Test
	/**
	 * Test, set apples to 60p and oranges to 25p. Assert that 3 oranges and 2
	 * apples = £1.95.<br/>
	 * Without discounts.
	 */
	public void testNoPromotions() {
		Orange orange = new Orange(25);
		Apple apple = new Apple(60);
		Map<ItemType, PromotionType> discounts = new HashMap<>();

		Checkout checkout = new Checkout(discounts);
		List<Item> shoppingBasket = new ArrayList<>();

		shoppingBasket.add(orange);
		shoppingBasket.add(apple);
		shoppingBasket.add(apple);
		shoppingBasket.add(orange);
		shoppingBasket.add(orange);
		int shoppingBasketTotal = checkout.getItemsTotal(shoppingBasket);

		assertEquals("Shopping basket total not match expected result: ", 195, shoppingBasketTotal);
	}

	@Test
	/**
	 * Test, set apples to 60p and oranges to 25p. Assert that 3 oranges and 2
	 * apples = £1.95.<br/>
	 * With discounts applied.
	 */
	public void testWithPromotions() {
		Orange orange = new Orange(25);
		Apple apple = new Apple(60);
		Map<ItemType, PromotionType> discounts = new HashMap<>();
		discounts.put(ItemType.APPLE, PromotionType.TWO_FOR_ONE);
		discounts.put(ItemType.ORANGE, PromotionType.THREE_FOR_TWO);

		Checkout checkout = new Checkout(discounts);
		List<Item> shoppingBasket = new ArrayList<>();

		shoppingBasket.add(orange);
		shoppingBasket.add(apple);
		shoppingBasket.add(apple);
		shoppingBasket.add(orange);
		shoppingBasket.add(orange);
		int shoppingBasketTotal = checkout.getItemsTotal(shoppingBasket);

		assertEquals("Shopping basket total not match expected result: ", 110, shoppingBasketTotal);
	}

	/**
	 * Test exception is raised when trying to create orange item with negative
	 * price.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testNoNegativePrices() {
		Orange orange = new Orange(-25);
	}

}
