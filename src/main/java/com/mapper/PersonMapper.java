package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Person;

public interface PersonMapper {
	/**
	 * 增
	 * 为啥insertAPerson1和insertAPerson名字不同呢?因为mybatis禁止使用重载
	 * */
	void insertAPerson1(@Param("id") Integer id,
			@Param("name") String name,
			@Param("age") Integer age,
			@Param("email") String email);
	void insertAPerson(@Param("person") Person person);

	void insertPersons(@Param("persons") List<Person> persons);//将list<Person>插入数据库
	/*删*/
	void deletePerson(@Param("id") Integer id);
	/*查*/
	Person selectAPerson(Integer id);//查
	List<Person> selectPersons(@Param("id") Integer id);
	List<Person> selectPersons1(@Param("id") Integer id);
	/*current：当前页，page size：每页数量*/
	List<Person> selectPersonsPage(@Param("current") Integer current,@Param("pagesize") Integer pagesize);
	/*改*/
	void modName(@Param("id") Integer id,@Param("name") String name);
	void modPerson(@Param("person") Person person);
	
	void modPersons(@Param("persons") List<Person> persons);
}
