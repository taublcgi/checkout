package supermarket.checkout;

import java.math.BigDecimal;
import java.util.List;

import supermarket.item.Item;


public class Checkout {
	public static BigDecimal getItemsTotal(List<Item> items){
		BigDecimal total= new BigDecimal(0);
		for (Item item:items){
			total = total.add(item.getPrice());
		}
		return total;
	}
}
