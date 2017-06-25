package show;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class outServlet4
 */
@WebServlet("/outServlet4")
public class outServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public outServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getParameter("kaoshenghao");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("outwrite4.jsp");
//        String name = "史迪仔";
//     	String sex = "男";
//    	String year = "2017"; 
//    	String month = "6"; 
//    	String day = "18"; 
//     	String id = "441900197604142912";
//     	String minzu = "汉";
//     	String jiguan = "广东";
//     	String schooladdress = "中国地质大学（武汉）";
//     	String baokaojibie = "一级";
//     	String address = "佛山顺德区";
//     	String phone = "13016467243";
//     	String email = "313804866@qq.com";
//     	String youbian = "523000";
        String name = null;
     	String sex = null;
    	String year = null; 
    	String month = null; 
    	String day = null; 
     	String id = null;
     	String minzu = null;
     	String jiguan = null;
     	String schooladdress = null;
     	String baokaojibie = null;
     	String address = null;
     	String phone = null;
     	String email = null;
     	String youbian = null;     	
     	
     	System.out.println("考生号"+kaoshenghao);
     	/*
     	 * 
     	 * 数据库拿信息
     	 * 
     	 * 
     	 * */
		DBHelper.DB_driver();
		Connection connect = null;
     	Statement stmt = null;
     	try {
     	      connect = DriverManager.getConnection(
     	          DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);

     	      System.out.println("Success connect Mysql server!");
     	      stmt = connect.createStatement();
     	      String sql = "select computer.*,user.ID from computer,user where computer.kaoshenghao=user.kaoshenghao='"+kaoshenghao+"';";	//查询表user
	     	  ResultSet rs = stmt.executeQuery(sql);	
	     	  if(rs.next()) {
	     		  name = rs.getString("name");
	     		  sex = rs.getString("sex");
	     		  year = rs.getString("year");
	     		  month = rs.getString("month");
	     		  day = rs.getString("day");
	     		  id = rs.getString("user.ID");
	     		  minzu = rs.getString("minzu");
	     		  jiguan = rs.getString("jiguan");
	     		 baokaojibie = rs.getString("baokaojibie");
	     		  schooladdress = rs.getString("school");
	     		  address = rs.getString("address");
	     		  phone = rs.getString("phone");
	     		  email = rs.getString("email");
	     		  youbian = rs.getString("youbian");
     	      }
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
     	    }
     	    catch (Exception e) {
     	      System.out.print("get data error!");
     	      e.printStackTrace();
     	    }
     	
     	
     	
     	
        request.setAttribute("name",name);//存值
        
        request.setAttribute("kaoshenghao",kaoshenghao);
        
        request.setAttribute("sex",sex);
        request.setAttribute("year",year);
        request.setAttribute("month",month);
        request.setAttribute("day",day);
        request.setAttribute("id",id);
        request.setAttribute("minzu",minzu);
        request.setAttribute("jiguan",jiguan);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("baokaojibie",baokaojibie);
        request.setAttribute("address",address);
        request.setAttribute("phone",phone);
        request.setAttribute("email",email);
        request.setAttribute("youbian",youbian);
        rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
