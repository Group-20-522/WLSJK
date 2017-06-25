package get;

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

import java.sql.*;

import db.DBconfig;

/**
 * Servlet implementation class logon_inServlet
 */
@WebServlet("/logon_inServlet")
public class logon_inServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logon_inServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*注册的*/
		request.setCharacterEncoding("UTF-8");		
		String id = request.getParameter("Username");//身份证号
     	String password = request.getParameter("NPassword");//密码
//     	String id = "361204199801310217";
//     	String password = "1234";
     	String kaoshenghao;
     	/*
     	 * 
     	 * 查数据库看看有没有这个人
     	 * 
     	 * 
     	 * 
     	 * */
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
   	      	if(!rs.next()) {//查无此人注册
   	      		insertuser(id,password);
   	      		
   	      		
   	      		
   	      		
   	      		kaoshenghao=findkaoshenghao(id);
   	      		System.out.println(kaoshenghao);
   	      		request.setAttribute("kaoshenghao",kaoshenghao);//传考生号
   	      		request.getRequestDispatcher("logon_success.jsp").forward(request, response);
	     	  }
	     	  else {	//查有此人失败
	     		 request.getRequestDispatcher("logon_fail.jsp").forward(request, response);
	     	  }
	     	  
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
   	    }
   	    catch (Exception e) {
   	      System.out.print("get data error!");
   	      e.printStackTrace();
   	    }
     	/*
     	if(查无此人)
     	{
     		
     		
     		 //入库
			request.setAttribute("kaoshenghao",kaoshenghao);//传考生号
     		request.getRequestDispatcher("logon_success.jsp").forward(request, response);
     	}
     	else
     	{
     		request.getRequestDispatcher("logon_fail.jsp").forward(request, response);
     	}
		*/
     	
     	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	void insertuser(String id,String password) 
	{
		Connection connect = null;
		PreparedStatement Statement = null;
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		    String sql1 = "INSERT INTO user (ID) VALUES (?);";
			Statement=connect.prepareStatement(sql1);

			Statement.setString(1,id);
			Statement.executeUpdate();
			System.out.println("insert into user success");
			
			if(connect != null) connect.close();
			if(Statement != null) Statement.close();
		}catch(SQLException e)
		{
		}
		connect = null;
		Statement = null;
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		   
			
			String sql2 = "INSERT INTO password (ID,password) VALUE (?,?);";
			Statement=connect.prepareStatement(sql2);

			Statement.setString(1,id);
			Statement.setString(2,password);
			Statement.executeUpdate();
			System.out.println("insert into password success");
			if(connect != null) connect.close();
			if(Statement != null) Statement.close();
		}catch(SQLException e)
		{
		}
	}
	
	String findkaoshenghao(String id) 
	{
		String kaoshenghao = null;
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
	     	  }
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
     	}
     	catch (Exception e) {
     		System.out.print("get data error!");
     		e.printStackTrace();
     	}
		
		return kaoshenghao;
	}

}
