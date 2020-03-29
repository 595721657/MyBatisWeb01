package conteller.provider;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Provider;
import service.provider.ProviderService;
import service.provider.impl.ProviderServiceImpl;
@WebServlet("/Provider")
public class ProviderServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1409635373057836638L;
    private ProviderService ps=new ProviderServiceImpl();
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
			showProvider(req,resp);
		}
	}
    //չʾ���е�����
	private void showProvider(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//���ò�ѯ���еķ���
			List<Provider> list=ps.getAll();
			req.getSession().setAttribute("provider",list);
			resp.sendRedirect("provider_index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
