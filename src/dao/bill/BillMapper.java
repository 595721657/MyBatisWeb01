package dao.bill;

import java.util.List;

import entity.Bill;

public interface BillMapper {
	//��ѯ��������
	List<Bill> getAll();
	//ͨ����Ʒ����(ģ����ѯ) ��Ӧ�� �Ƿ񸶿��ѯ����
	List<Bill> getBillList(Bill bill);
}
