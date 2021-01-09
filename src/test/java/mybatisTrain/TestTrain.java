package mybatisTrain;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mapper.OrderMapper;
import com.pojo.Order;

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
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		List<Order> list = mapper.selectAll();
		for (Order item : list) {
			System.out.println(item.toString());
		}
		
	}
	@After
	public void After() {
		sqlSession.commit();
		sqlSession.close();
	}
}
