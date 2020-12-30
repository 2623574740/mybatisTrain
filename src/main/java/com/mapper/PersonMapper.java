package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Person;

public interface PersonMapper {
	/**
	 * ��
	 * ΪɶinsertAPerson1��insertAPerson���ֲ�ͬ��?��Ϊmybatis��ֹʹ������
	 * */
	public void insertAPerson1(@Param("id") Integer id,
			@Param("name") String name,
			@Param("age") Integer age,
			@Param("email") String email);
	public void insertAPerson(@Param("person") Person person);
	public void insertPersons(@Param("persons") List<Person> persons);//��list<Person>�������ݿ�
	/*ɾ*/
	public void deletePerson(@Param("id") Integer id);
	/*��*/
	public Person selectAPerson(Integer id);//��
	public List<Person> selectPersons(@Param("id") Integer id);
	/*��*/
	public void modName(@Param("id") Integer id,@Param("name") String name);

}
