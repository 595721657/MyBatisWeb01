package service.provider.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.provider.ProviderMapper;
import entity.Provider;
import service.provider.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    //创建一个providerMapper对象
	private ProviderMapper mapper;
	//查询所有的供应商
	@Override
	public List<Provider> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//获得mapper对象
		mapper=sqlsession.getMapper(ProviderMapper.class);
		List<Provider> provider=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return provider;
	}

}
