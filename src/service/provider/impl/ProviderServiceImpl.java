package service.provider.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.provider.ProviderMapper;
import entity.Provider;
import service.provider.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    //����һ��providerMapper����
	private ProviderMapper mapper;
	//��ѯ���еĹ�Ӧ��
	@Override
	public List<Provider> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//���mapper����
		mapper=sqlsession.getMapper(ProviderMapper.class);
		List<Provider> provider=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return provider;
	}

}
