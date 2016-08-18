package supermarket.item;

import java.math.BigDecimal;

/**
 * Shopping item.
 * @author louistaub
 *
 */
public abstract class Item {
	private BigDecimal price;
	
	/**
	 * Big decimal, for currency accuracy.
	 * @return price.
	 */
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public abstract String getItemType();	
	
}
