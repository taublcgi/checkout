package supermarket.checkout;

import supermarket.item.Item;
import supermarket.item.promo.PromotionType;

/**
 * Promotion interface for Checkout.
 * 
 * @author Louis Taub
 *
 */
public interface Promotion {

	/**
	 * Apply discount to item.
	 * 
	 * @param item
	 *            shopping item.
	 * @return price with discount applied.
	 */
	public int applyDiscount(Item item);

	/**
	 * 
	 * @param promoType
	 *            type of promotion
	 * @param noItems
	 *            number of items already passed through the checkout for this
	 *            basket.
	 * @param price
	 *            of item
	 * @return the item with discount applied.
	 */
	public int applyDiscount(PromotionType promoType, int noItems, int price);
}
