package dao.bill;

import java.util.List;

import entity.Bill;

public interface BillMapper {
	//查询所有数据
	List<Bill> getAll();
	//通过商品名称(模糊查询) 供应商 是否付款查询数据
	List<Bill> getBillList(Bill bill);
}
