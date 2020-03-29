package service.address.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.address.AddressMapper;
import entity.Address;
import service.address.AddressService;

public class AddressServiceImpl implements AddressService {
    //����һ��userMapper����
	private AddressMapper mapper;
		@Override
		public List<Address> getAll() {
			SqlSession sqlsession=MyBatisUtils.createSqlSession();
			//���mapper����
			mapper=sqlsession.getMapper(AddressMapper.class);
			List<Address> address=mapper.getAll();
			MyBatisUtils.closeSqlSession(sqlsession);
			return address;
		}

}
