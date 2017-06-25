package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class login_inServlet
 */
@WebServlet("/login_inServlet")
public class login_inServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_inServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*鐧诲綍*/
		request.setCharacterEncoding("utf-8");		
		String id = request.getParameter("Username");//韬唤璇佸彿
     	String password = request.getParameter("NPassword");//瀵嗙爜
//     	String id="341204199801310217";
//     	String password = "1234";
     	String kaoshenghao;
     	
     	try {
     	      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
     	      //Class.forName("org.gjt.mm.mysql.Driver");
     	     System.out.println("Success loading Mysql Driver!");
     	    }
     	    catch (Exception e) {
     	      System.out.print("Error loading Mysql Driver!");
     	      e.printStackTrace();
     	    }
     	
     	Connection connect = null;
     	Statement stmt = null;
     	try {
     	      connect = DriverManager.getConnection(
     	          DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);

     	      System.out.println("Success connect Mysql server!");
     	      stmt = connect.createStatement();
     	      String sql = "select * from user where ID='"+id+"';";	//查询表user
	     	  ResultSet rs = stmt.executeQuery(sql);	
	     	  if(rs.next()) {
	     		  kaoshenghao=rs.getString("kaoshenghao");
	     		  System.out.println(kaoshenghao);
	     		  
	     		  if(ispassword(id,password)) {	//判断密码正确
	     			  request.setAttribute("kaoshenghao",kaoshenghao);//传考生号
	     			  request.getRequestDispatcher("whochoose").forward(request, response);//跳转到报考界面
	     		  }else {	//错误
	     			  request.getRequestDispatcher("login_fail.jsp").forward(request, response);//跳转到失败页面
	     		  }
     	      }
	     	  else {
	     		 request.getRequestDispatcher("login_fail.jsp").forward(request, response);//跳转到失败页面
	     	  }
	     	  
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
     	    }
     	    catch (Exception e) {
     	      System.out.print("get data error!");
     	      e.printStackTrace();
     	    }
     		
     	  
     	/*
     	 * 
     	 * 鏌ユ暟鎹簱鐪嬬湅鏈夋病鏈夎繖涓汉
     	 * 
     	 * 
     	 * 
     	 * */
     	
     	
     	/*
     	if(鏌ユ湁姝や汉)
     	{
     		
     		
     		 //鍏ュ簱鎷胯�冪敓鍙� kaoshenghao=?
     		
     	
			request.setAttribute("kaoshenghao",kaoshenghao);
     		request.getRequestDispatcher("choose.jsp").forward(request, response);
     		
     	}
     	else
     	{
     		request.getRequestDispatcher("login_fail.jsp").forward(request, response);
     	}
		*/
     	
     	
}

	//判断密码


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}



	boolean ispassword(String id,String password) {
		Connection connect = null;
	 	Statement stmt = null;
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
	
			System.out.println("Success connect Mysql server!");
			stmt = connect.createStatement();
			String sql = "select * from password where ID = '"+id+"'and password ='"+password+"';";	//查询表user
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				return true;
		      	}
	     	  
			if(stmt != null) stmt.close();
			if(connect != null) connect.close();  
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return false;
	}
}
