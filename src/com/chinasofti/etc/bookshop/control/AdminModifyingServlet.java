package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.etc.bookshop.po.Admin;
import com.chinasofti.etc.bookshop.service.AdminService;
import com.chinasofti.etc.bookshop.service.impl.AdminServiceImpl;

public class AdminModifyingServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AdminModifyingServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String adminIdString = request.getParameter("adminid");
		int adminId = Integer.parseInt(adminIdString);

		String adminName = request.getParameter("adminname");
		String adminPassword = request.getParameter("adminpassword");

		AdminService adminService = new AdminServiceImpl();

		Admin admin = new Admin();
		admin.setAdminId(adminId);
		admin.setAdminName(adminName);
		admin.setAdminPassword(adminPassword);
		adminService.modifyAdmins(admin);

		response.sendRedirect("success.jsp");

	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
