package mybatisTrain;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mapper.PersonMapper;
import com.pojo.Person;

public class TestTrain {
	private SqlSessionFactory sqlsessionfactory = null;
	private SqlSession sqlSession = null;
	@Before
	public void Before() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlsessionfactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	@Test//����ʹ��mapper.xml
	public void test() {
		 this.sqlSession = sqlsessionfactory.openSession();//��ȡ�Ի�
		 Person person = sqlSession.selectOne("com.PersonMapper.selectAPerson",1);
		 sqlSession.insert("",new Person());
		 System.out.println(person.toString());
	}
	@Test //����ʹ��ӳ��ӿڲ�ѯ
	public void test01() {
		this.sqlSession = sqlsessionfactory.openSession();
		PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
		/**��*/
		Person person = personMapper.selectAPerson(1);
		System.out.println("��ѯ�����"+person.toString());
		/**������󼯺�
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(3,"1",1,"1"));
		persons.add(new Person(4,"4",4,"4"));
		persons.add(new Person(5,"5",5,"5"));
		persons.add(new Person(6,"6",6,"6"));
		persons.add(new Person(7,"7",7,"7"));
		persons.add(new Person(8,"8",8,"8"));
		personMapper.insertPersons(persons);
		List<Person> persons = personMapper.selectPersons(3);
		for (Person person : persons) {
			System.out.println(person.toString());
		}*/
		/**person.setId(person.getId()+1);
		person.setName("Alice");
		��0
		personMapper.insertAPerson1(4,"����",18,"3132123@email.com");*/
		/**��1
		personMapper.insertAPerson(person);*/
		/**��list*/
	
		/*ɾ��
		personMapper.deletePerson(4);*/
		/*�޸�
		personMapper.modName(1, "bob");*/
	}
	@After
	public void After() {
		sqlSession.commit();
		sqlSession.close();
	}
}
