package conteller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.user.UserService;
import service.user.impl.UserServiceImpl;
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9134426172309073663L;
    private UserService us=new UserServiceImpl();
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
			showUser(req,resp);
		}
	}

	private void showUser(HttpServletRequest req, HttpServletResponse resp) {
	    try {
			//调用查询所有的方法
			List<User> list=us.getAll();
			req.getSession().setAttribute("user",list);
			resp.sendRedirect("user_index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
