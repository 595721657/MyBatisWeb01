package conteller.role;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Role;
import service.role.RoleService;
import service.role.impl.RoleServiceImpl;
@WebServlet("/Role")
public class RoleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4929687283233119385L;
	private RoleService rs=new RoleServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收页面数据
		req.setCharacterEncoding("UTF-8");
		String op=req.getParameter("op");
		if("show".equals(op)) {
			//调用展示全部数据的方法
			showAddress(req,resp);
		}
	}

	private void showAddress(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//调用查询所有的方法
			List<Role> role=rs.getAll();
			req.getSession().setAttribute("role",role);
			resp.sendRedirect("role_index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
