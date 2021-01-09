package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Person;

public interface PersonMapper {
	/**
	 * ��
	 * ΪɶinsertAPerson1��insertAPerson���ֲ�ͬ��?��Ϊmybatis��ֹʹ������
	 * */
	void insertAPerson1(@Param("id") Integer id,
			@Param("name") String name,
			@Param("age") Integer age,
			@Param("email") String email);
	void insertAPerson(@Param("person") Person person);

	void insertPersons(@Param("persons") List<Person> persons);//��list<Person>�������ݿ�
	/*ɾ*/
	void deletePerson(@Param("id") Integer id);
	/*��*/
	Person selectAPerson(Integer id);//��
	List<Person> selectPersons(@Param("id") Integer id);
	List<Person> selectPersons1(@Param("id") Integer id);
	/*current����ǰҳ��page size��ÿҳ����*/
	List<Person> selectPersonsPage(@Param("current") Integer current,@Param("pagesize") Integer pagesize);
	/*��*/
	void modName(@Param("id") Integer id,@Param("name") String name);
	void modPerson(@Param("person") Person person);
	
	void modPersons(@Param("persons") List<Person> persons);
}
