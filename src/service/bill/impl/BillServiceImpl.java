package service.bill.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MyBatisUtils;
import dao.bill.BillMapper;
import entity.Bill;
import service.bill.BillService;

public class BillServiceImpl implements BillService {
    //����һ��userMapper����
	private BillMapper mapper;
	@Override
	public List<Bill> getAll() {
		SqlSession sqlsession=MyBatisUtils.createSqlSession();
		//���mapper����
		mapper=sqlsession.getMapper(BillMapper.class);
		List<Bill> bill=mapper.getAll();
		MyBatisUtils.closeSqlSession(sqlsession);
		return bill;
	}

}
