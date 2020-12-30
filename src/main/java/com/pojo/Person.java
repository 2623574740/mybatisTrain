package com.pojo;

public class Person {
	public Person() {
		
	}
	public Person(Integer id,String name,Integer age,String email) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
	}
	private Integer id = 0;
	private String name = "";
	private Integer age = 0;
	private String email = "";
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("id:%d  name:%s  age:%d  email:%s", this.id,this.name,this.age,this.email);
	}
}
