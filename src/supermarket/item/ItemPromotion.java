package supermarket.item;

import supermarket.item.promo.PromotionType;

/**
 * Interface to add promotional functionality to a supermarket Item.
 * 
 * @author Louis Taub
 *
 */
public interface ItemPromotion {

	/**
	 * 
	 * @return the promotion type to be applied at checkout.
	 */
	public PromotionType promoType();
}
