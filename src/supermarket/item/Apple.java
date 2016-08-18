package supermarket.item;

import java.math.BigDecimal;

/**
 * Apple shopping item.
 * @author Louis Taub
 *
 */
public class Apple extends Item {

	private static final String ITEM_TYPE = "Apple";
	
	public Apple(BigDecimal price){
		this.setPrice(price);
	}

	@Override
	public String getItemType() {
		return ITEM_TYPE;
	}
}
