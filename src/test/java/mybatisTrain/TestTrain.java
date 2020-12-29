package mybatisTrain;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.pojo.Person;

public class TestTrain {
	private SqlSessionFactory sqlsessionfactory = null;
	@Before
	public void Before() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlsessionfactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void test() {
		 SqlSession sqlSession = sqlsessionfactory.openSession();
		 Person person = sqlSession.selectOne("com.PersonMapper.selectAPerson",1);
		 System.out.println(person.toString());
	}

}
