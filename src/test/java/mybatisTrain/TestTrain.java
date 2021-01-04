package mybatisTrain;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@Test//µ•∂¿ π”√mapper.xml
	public void test() {
		this.sqlSession = sqlsessionfactory.openSession();
		PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1,"1",1,"1"));
		persons.add(new Person(2,"4",4,"4"));
//		persons.add(new Person(3,"5",5,"5"));
//		persons.add(new Person(4,"6",6,"6"));
//		persons.add(new Person(5,"7",7,"7"));
//		personMapper.insertPersons(persons);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("persons", persons);
		//personMapper.modPersons(persons);
		List<Person> list = personMapper.selectPersonsPage(0, 3);
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
	@After
	public void After() {
		sqlSession.commit();
		sqlSession.close();
	}
}
