package service.role.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.role.RoleMapper;
import entity.Role;
import service.role.RoleService;

public class RoleServiceImpl implements RoleService {
    //����һ��userMapper����
	private RoleMapper mapper;
	@Override
	public List<Role> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//���mapper����
		mapper=sqlsession.getMapper(RoleMapper.class);
		List<Role> role=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return role;
	}

}
