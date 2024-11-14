package com.hit.srv;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hit.beans.VendorBean;
@WebServlet("/LogoutSrv")
public class LogoutSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LogoutSrv() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("user", "");
		session.setAttribute("username", "");
		session.setAttribute("password", "");
		session.setAttribute("vendordata", new VendorBean());
		response.sendRedirect("logoutSuccess.jsp");
	}
}
