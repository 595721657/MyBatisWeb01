import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import commons.MyBatisUtils;
import dao.provider.ProviderMapper;
import entity.Provider;

class ProviderTest {
    private Logger log=Logger.getLogger(ProviderTest.class);
	@Test
	void test() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		List<Provider> list=sqlsession.getMapper(ProviderMapper.class).getAll();
		for (Provider provider : list) {
			log.info("供应商姓名:"+provider.getProName()+"\t"+"创建者姓名:"+provider.getCreateUserName());
		}
		MyBatisUtils.closeSqlSession(sqlsession);
	}

}
