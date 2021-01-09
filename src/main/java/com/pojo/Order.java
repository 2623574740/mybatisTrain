package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Order {
	private String id;
	private Date create_time ;
	private String subscriber ;
	private Date delivery_date;
	private Boolean signfor;
	public Order() {
		setId();
	}
	public Order(Date createTime,String subscriber,Date deliveryDate,Boolean signfor) {
		setId();
		setCreate_time(createTime);
		setDelivery_date(deliveryDate);
		setSubscriber(subscriber);
		setSignfor(signfor);
	}
	public String getId() {
		return id;
	}
	public void setId() {
		id = UUID.randomUUID().toString();
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	
	public Boolean getSignfor() {
		return signfor;
	}
	public void setSignfor(Boolean signfor) {
		this.signfor = signfor;
	}
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		return String.format("id:[%s],subscriber:[%s],create_time:[%s],delivery_date[%s],signfor:[%s]",
				getId(),
				getSubscriber(),
				dateFormat.format(getCreate_time()),
				dateFormat2.format(getDelivery_date()),
				getSignfor().toString()
				);
	}
}
