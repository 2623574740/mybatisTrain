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
	@Test//单独使用mapper.xml
	public void test() {
		 this.sqlSession = sqlsessionfactory.openSession();//获取对话
		 Person person = sqlSession.selectOne("com.PersonMapper.selectAPerson",1);
		 sqlSession.insert("",new Person());
		 System.out.println(person.toString());
	}
	@Test //单独使用映射接口查询
	public void test01() {
		this.sqlSession = sqlsessionfactory.openSession();
		PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
		/**查*/
		Person person = personMapper.selectAPerson(1);
		System.out.println("查询结果："+person.toString());
		/**插入对象集合
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
		增0
		personMapper.insertAPerson1(4,"张三",18,"3132123@email.com");*/
		/**增1
		personMapper.insertAPerson(person);*/
		/**增list*/
	
		/*删除
		personMapper.deletePerson(4);*/
		/*修改
		personMapper.modName(1, "bob");*/
	}
	@After
	public void After() {
		sqlSession.commit();
		sqlSession.close();
	}
}
