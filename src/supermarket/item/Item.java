package supermarket.item;

/**
 * Shopping item.
 * 
 * @author louistaub
 *
 */
public abstract class Item {
	private int price;

	/**
	 * Initialise item and set price, ensure zero or negative prices cannot be
	 * applied.
	 * 
	 * @param price
	 */
	public Item(int price) {
		if (price < 1) {
			throw new IllegalArgumentException("Cannot set zero or negative price.");
		} else {
			this.price = price;
		}
	}

	/**
	 * Integer used for currency accuracy.
	 * 
	 * @return the item price.
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Set the price.
	 * 
	 * @param price
	 *            of Item
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @return the items type.
	 */
	public abstract ItemType getItemType();

}
