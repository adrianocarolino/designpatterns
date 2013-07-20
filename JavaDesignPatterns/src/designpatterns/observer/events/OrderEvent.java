package designpatterns.observer.events;

import java.sql.Timestamp;
import java.util.Date;

public class OrderEvent {
	
	private Date date;
	
	private Timestamp time;
	
	public OrderEvent() {
		date = new Date();
		time = new Timestamp(System.currentTimeMillis());
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}
