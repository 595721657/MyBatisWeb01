package service.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.user.UserMapper;
import entity.User;
import service.user.UserService;

public class UserServiceImpl implements UserService {
    //创建一个userMapper对象
	private UserMapper mapper;
	@Override
	public List<User> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//获得mapper对象
		mapper=sqlsession.getMapper(UserMapper.class);
		List<User> user=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return user;
	}

}
