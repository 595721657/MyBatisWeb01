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
		bill.setProductName("精");
		bill.setProviderId(14);
		bill.setIsPayment(1);
		sqlsession=MyBatisUtils.createSqlSession();
	    List<Bill> list=sqlsession.getMapper(BillMapper.class).getBillList(bill);
	   for (Bill bill2 : list) {
		log.info("订单编码："+bill2.getBillCode()+"\t"+"商品名称："+bill2.getProductName()+"\t"+"供应商编码："+bill2.getProvider().getProCode()+"\t"+"供应商名称："+bill2.getProvider().getProName()+"\t"+"供应商联系人："+bill2.getProvider().getProContact()+"\t"+"供应商联系方式："+bill2.getProvider().getProPhone()+"\t"+"是否付款："+bill2.getIsPayment()+"\t"+"订单金额"+bill2.getProductCount());
	   }
	   MyBatisUtils.closeSqlSession(sqlsession);
	}

}
