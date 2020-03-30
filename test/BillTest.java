import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import commons.MyBatisUtils;
import dao.bill.BillMapper;
import entity.Bill;

class BillTest {
	private Logger log=Logger.getLogger(BillTest.class);
    private SqlSession sqlsession;
	@Test
	void test() {
		Bill bill=new Bill();
		bill.setProductName("��");
		bill.setProviderId(14);
		bill.setIsPayment(1);
		sqlsession=MyBatisUtils.createSqlSession();
	    List<Bill> list=sqlsession.getMapper(BillMapper.class).getBillList(bill);
	   for (Bill bill2 : list) {
		log.info("�������룺"+bill2.getBillCode()+"\t"+"��Ʒ���ƣ�"+bill2.getProductName()+"\t"+"��Ӧ�̱��룺"+bill2.getProvider().getProCode()+"\t"+"��Ӧ�����ƣ�"+bill2.getProvider().getProName()+"\t"+"��Ӧ����ϵ�ˣ�"+bill2.getProvider().getProContact()+"\t"+"��Ӧ����ϵ��ʽ��"+bill2.getProvider().getProPhone()+"\t"+"�Ƿ񸶿"+bill2.getIsPayment()+"\t"+"�������"+bill2.getProductCount());
	   }
	   MyBatisUtils.closeSqlSession(sqlsession);
	}

}
