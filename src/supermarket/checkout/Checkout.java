package supermarket.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import supermarket.item.Item;
import supermarket.item.ItemType;
import supermarket.item.promo.PromotionType;

/**
 * Checkout class to add items and apply discounts.<br/>
 * Using Integers to avoid loss of precision with decimals. Use formatting to
 * display decimals later<br/>
 * Applies discounts list with initialising checkout, this way promotions can be
 * changed in the future.
 * 
 * @author Louis Taub
 *
 */
public class Checkout implements Promotion {

	private Map<ItemType, PromotionType> discounts;
	private Map<ItemType, Integer> discountTracker;

	Checkout(Map<ItemType, PromotionType> discounts) {
		this.discounts = discounts;
		discountTracker = new HashMap<>();

		// Initialise the discount tracker; Could also be done with Lambda.
		for (ItemType itemType : ItemType.values()) {
			discountTracker.put(itemType, 0);
		}
	}

	public int getItemsTotal(List<Item> items) {
		int total = 0;
		for (Item item : items) {
			total += applyDiscount(item);
		}

		return total;
	}

	@Override
	public int applyDiscount(Item item) {
		int price = item.getPrice();
		int noItems = 0;
		PromotionType promotionType = discounts.get(item.getItemType());
		if (promotionType != null && promotionType != PromotionType.NONE) {

			discountTracker.put(item.getItemType(), discountTracker.get(item.getItemType()) + 1);
			noItems = discountTracker.get(item.getItemType());

		}
		if (promotionType != null) {
			price = applyDiscount(promotionType, noItems, price);
		}
		return price;
	}

	@Override
	public int applyDiscount(PromotionType promoType, int noItems, int price) {
		int returnPrice = price;
		switch (promoType) {
		case THREE_FOR_TWO:
			if (noItems % 3 == 0) {
				returnPrice = 0;
			}
			break;
		case TWO_FOR_ONE:
			if (noItems % 2 == 0) {
				returnPrice = 0;
			}
			break;
		default:
			break;
		}
		return returnPrice;
	}

}
