package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Person;

public interface PersonMapper {
	/**
	 * 增
	 * 为啥insertAPerson1和insertAPerson名字不同呢?因为mybatis禁止使用重载
	 * */
	public void insertAPerson1(@Param("id") Integer id,
			@Param("name") String name,
			@Param("age") Integer age,
			@Param("email") String email);
	public void insertAPerson(@Param("person") Person person);

	public void insertPersons(@Param("persons") List<Person> persons);//将list<Person>插入数据库
	/*删*/
	public void deletePerson(@Param("id") Integer id);
	/*查*/
	public Person selectAPerson(Integer id);//查
	public List<Person> selectPersons(@Param("id") Integer id);
	public List<Person> selectPersons1(@Param("id") Integer id);
	/*current：当前页，pagesize：每页数量*/
	public List<Person> selectPersonsPage(@Param("current") Integer current,@Param("pagesize") Integer pagesize);
	/*改*/
	public void modName(@Param("id") Integer id,@Param("name") String name);
	public void modPerson(@Param("person") Person person);
	
	public void modPersons(@Param("persons") List<Person> persons);
}
