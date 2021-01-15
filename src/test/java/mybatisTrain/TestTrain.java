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

import com.mapper.GoodsMapper;
import com.pojo.Goods;

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
		GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);		
		List<Goods> res = mapper.selectAll();
		for (Goods goods : res) {
			System.out.println(goods.toString());
		}
	}
	@After
	public void After() {
		sqlSession.commit();
		sqlSession.close();
	}
}
