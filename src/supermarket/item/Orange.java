package supermarket.item;

/**
 * Orange shopping item.
 * 
 * @author Louis Taub
 *
 */
public class Orange extends Item {

	private static final ItemType ITEM_TYPE = ItemType.ORANGE;

	/**
	 * @param price
	 *            create new item and set price.
	 */
	public Orange(int price) {
		super(price);
	}

	@Override
	public ItemType getItemType() {
		return ITEM_TYPE;
	}
}
