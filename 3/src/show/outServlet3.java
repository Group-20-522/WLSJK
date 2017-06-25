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
 * Servlet implementation class outServlet3
 */
@WebServlet("/outServlet3")
public class outServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public outServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getParameter("kaoshenghao");
		System.out.println(kaoshenghao);
		
		RequestDispatcher rd = request.getRequestDispatcher("outwrite3.jsp");
//      String name = "史迪仔";
//     	String sex = "男";
//     	String maritalstatus = "未婚";
//    	String year = "2017"; 
//    	String month = "6"; 
//    	String day = "18"; 
//     	String id = "441900197604142912";
//     	String minzu = "汉";
//     	String jiguan = "广东";
//     	String origin = "本科毕业生";
//     	String soldier = "非军人";
//     	String schooladdress = "中国地质大学（武汉）";
//     	String politicalstatus = "共青团员";
//     	String address = "佛山顺德区";
//     	String phone = "13016467243";
//     	String email = "313804866@qq.com";
//     	String youbian = "523000";
        String name = null;
     	String sex = null;
     	String maritalstatus = null;
    	String year = null; 
    	String month = null; 
    	String day = null; 
     	String id = null;
     	String minzu = null;
     	String jiguan = null;
     	String origin = null;
     	String soldier = null;
     	String schooladdress = null;
     	String politicalstatus = null;
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
     	      String sql = "select dizhi.*,user.ID from dizhi,user where dizhi.kaoshenghao=user.kaoshenghao='"+kaoshenghao+"';";	//查询表user
	     	  ResultSet rs = stmt.executeQuery(sql);	
	     	  if(rs.next()) {
	     		  name = rs.getString("studentname");
	     		  sex = rs.getString("sex");
	     		  year = rs.getString("year");
	     		  month = rs.getString("month");
	     		  day = rs.getString("day");
	     		  maritalstatus = rs.getString("hunyin");
	     		  id = rs.getString("ID");
	     		  minzu = rs.getString("minzu");
	     		  jiguan = rs.getString("jiguan");
	     		  schooladdress = rs.getString("school");
	     		  politicalstatus = rs.getString("zhengzhimianmao");
	     		  address = rs.getString("address");
	     		  origin = rs.getString("origin");
	     		  soldier = rs.getString("soldier");
//	     		  System.out.println(schooladdress);
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
        request.setAttribute("maritalstatus",maritalstatus);
        request.setAttribute("year",year);
        request.setAttribute("month",month);
        request.setAttribute("day",day);
        request.setAttribute("id",id);
        request.setAttribute("minzu",minzu);
        request.setAttribute("jiguan",jiguan);
        request.setAttribute("origin",origin);
        request.setAttribute("soldier",soldier);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("politicalstatus",politicalstatus);
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
