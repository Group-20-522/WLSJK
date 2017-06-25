package show;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class outServlet1
 */
@WebServlet("/outServlet1")
public class outServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public outServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getParameter("kaoshenghao");
		kaoshenghao = "1";
		RequestDispatcher rd = request.getRequestDispatcher("outwrite1.jsp");
//        String name = "闻迪桉";
//     	String sex = "1";
//    	String year = "2017"; 
//    	String month = "6"; 
//    	String day = "18"; 
//     	String id = "441900199604142912";
//     	String minzu = "汉";
//     	String jiguan = "广东";
//     	String xueli = "本科";
//     	String schooladdress = "中国地质大学（武汉）";
//     	String address = "佛山顺德区";
//     	String phone = "13016467633";
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
	   	String xueli = null;
	   	String schooladdress = null;
	   	String address = null;
	   	String phone = null;
	   	String email = null;
	   	String youbian = null;
		
//     	System.out.println("考生号"+kaoshenghao);
     	/*
     	 * 已知kaoshenghao考生号
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
     	      String sql = "select english4.*,user.ID from english4,user where english4.kaoshenghao=user.kaoshenghao='"+kaoshenghao+"';";	//查询表user
	     	  ResultSet rs = stmt.executeQuery(sql);	
	     	  if(rs.next()) {
	     		  name = rs.getString("english4.studentname");
	     		  sex = rs.getString("english4.sex");
	     		  year = rs.getString("english4.year");
	     		  month = rs.getString("english4.month");
	     		  day = rs.getString("english4.day");
	     		  id = rs.getString("user.ID");
	     		  minzu = rs.getString("english4.minzu");
	     		  jiguan = rs.getString("english4.jiguan");
	     		  xueli = rs.getString("english4.xueli");
	     		  schooladdress = rs.getString("english4.school");
	     		  address = rs.getString("english4.address");
//	     		  System.out.println(schooladdress);
	     		  phone = rs.getString("english4.phone");
	     		  email = rs.getString("english4.email");
	     		  youbian = rs.getString("english4.youbian");
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
        request.setAttribute("xueli",xueli);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("address",address);
        request.setAttribute("phone",phone);
        request.setAttribute("email",email);
        request.setAttribute("youbian",youbian);
        rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
