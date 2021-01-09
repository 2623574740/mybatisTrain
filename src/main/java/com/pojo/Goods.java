package com.pojo;

public class Goods {
	private String name;//货名
	private Double price;//单价
	private Integer total;//总数
	public Goods() {
		
	}
	public Goods(String name,Double price,Integer total) {
		setName(name);
		setPrice(price);
		setTotal(total);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public String toString() {
		return String.format("name:[%s],price:[%f],total:[%d]", getName(),getPrice(),getTotal());
	}
}
