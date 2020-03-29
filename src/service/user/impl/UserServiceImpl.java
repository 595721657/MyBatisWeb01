package service.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.user.UserMapper;
import entity.User;
import service.user.UserService;

public class UserServiceImpl implements UserService {
    //����һ��userMapper����
	private UserMapper mapper;
	@Override
	public List<User> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//���mapper����
		mapper=sqlsession.getMapper(UserMapper.class);
		List<User> user=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return user;
	}

}
