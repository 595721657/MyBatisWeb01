package service.address.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.address.AddressMapper;
import entity.Address;
import service.address.AddressService;

public class AddressServiceImpl implements AddressService {
    //创建一个userMapper对象
	private AddressMapper mapper;
		@Override
		public List<Address> getAll() {
			SqlSession sqlsession=MyBatisUtils.createSqlSession();
			//获得mapper对象
			mapper=sqlsession.getMapper(AddressMapper.class);
			List<Address> address=mapper.getAll();
			MyBatisUtils.closeSqlSession(sqlsession);
			return address;
		}

}
