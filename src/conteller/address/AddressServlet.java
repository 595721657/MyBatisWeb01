package conteller.address;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Address;
import service.address.AddressService;
import service.address.impl.AddressServiceImpl;
@WebServlet("/Address")
public class AddressServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4929687283233119385L;
	private AddressService asi=new AddressServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����ҳ������
		req.setCharacterEncoding("UTF-8");
		String op=req.getParameter("op");
		if("show".equals(op)) {
			//����չʾȫ�����ݵķ���
			showAddress(req,resp);
		}
	}

	private void showAddress(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//���ò�ѯ���еķ���
			List<Address> list=asi.getAll();
			req.getSession().setAttribute("address",list);
			resp.sendRedirect("address_index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
