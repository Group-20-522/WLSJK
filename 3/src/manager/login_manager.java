package manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBconfig;

/**
 * Servlet implementation class login_manager
 */
@WebServlet("/login_manager")
public class login_manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_manager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");		
		String id = request.getParameter("Username");//韬唤璇佸彿
     	String password = request.getParameter("Password");//瀵嗙爜
     	Connection connect = null;
	 	Statement stmt = null;
	 	System.out.println(id+"\t"+password);
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
	
			System.out.println("Success connect Mysql server-password!");
			stmt = connect.createStatement();
			String sql = "select * from mpassword where id = '"+id+"'and password ='"+password+"';";	//查询表user
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("true");
				/*跳转到成功页面*/
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 */

		    }
			else {
				/*
				 * 跳转到失败页面
				 * 
				 * 
				 */
				 request.getRequestDispatcher("login_fail.jsp").forward(request, response);//跳转到失败页面
			}
	     	rs.close();
	     	if(stmt != null) stmt.close();
	     	if(connect != null) connect.close();  
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
