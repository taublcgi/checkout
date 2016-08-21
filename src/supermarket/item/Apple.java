package supermarket.item;

import supermarket.item.promo.PromotionType;

/**
 * Apple shopping item. <br/>
 * Immutable, don't want to change the item attributes after instantiation.
 * 
 * @author Louis Taub
 *
 */
public class Apple extends Item implements ItemPromotion {

	private static final ItemType itemType = ItemType.APPLE;
	private PromotionType promoType;

	/**
	 * 
	 * @param price
	 *            create new item and set price.
	 */
	public Apple(int price) {
		super(price);
	}

	@Override
	public ItemType getItemType() {
		return itemType;
	}

	@Override
	public PromotionType promoType() {
		return this.promoType;
	}
}
