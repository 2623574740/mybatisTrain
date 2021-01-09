package com.pojo;

public class GoodsList {
	private String name = "";
	private Double total_price = 0.0;
	private Double quantity = 0.0;
	public GoodsList() {}
	public GoodsList(String name,Double total_price,Double quantity) {
		setName(name);
		setTotal_price(total_price);
		setQuantity(quantity);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
	
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		if (quantity == null) {
			quantity = 0.0;
		}
		this.quantity = quantity;
	}
	public String toString() {
		return String.format("name:[%s],price:[%f],quantity:[%f]", getName(),getTotal_price(),getQuantity());
	}
}
