package designpatterns.observer.model;

import designpatterns.observer.events.OrderEvent;

public class Shop implements OrderListener {
	
	private String shopName = null;
	
	public Shop() {
		this.shopName = "myShop";
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public void customerPaid(OrderEvent event) {
		System.out.println(event.getDate()); 
		System.out.println(event.getTime());
		
	}
	
	

}
