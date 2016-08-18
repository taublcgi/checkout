package supermarket.item;

import java.math.BigDecimal;

/**
 * Orange shopping item.
 * @author louistaub
 *
 */
public class Orange extends Item {

	private static final String ITEM_TYPE = "Orange";
	
	public Orange(BigDecimal price){
		this.setPrice(price);
	}
	
	@Override
	public String getItemType(){
		return ITEM_TYPE;
	}
}
