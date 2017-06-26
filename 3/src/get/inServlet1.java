package get;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class inServlet1
 */
@WebServlet("/inServlet1")
public class inServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		/*四级考试学生信息获取*/
		String name = request.getParameter("studentname");//姓名
     	String sex = request.getParameter("sex");//性别
    	String year = request.getParameter("year"); //年
    	String month = request.getParameter("month"); //月
    	String day = request.getParameter("day"); //日
     	String minzu = request.getParameter("minzu");//民族
     	String jiguan = request.getParameter("jiguan");//籍贯
     	String xueli = request.getParameter("xueli");//学历
     	String school = request.getParameter("schooladdress");//学校
     	String address = request.getParameter("address");//家庭地址
     	String phone = request.getParameter("grdh");//个人号码
     	String email = request.getParameter("email");//email
     	String youbian = request.getParameter("post");//邮编
		
//		String name = "wtc";
//     	String sex = "男";
//    	String year = "1998";
//    	String month = "1";
//    	String day = "31";
//     	String minzu = "汉";
//     	String jiguan = "安徽";
//     	String xueli = "本科";
//     	String school = "中国地质大学";
//     	String address = "安徽阜阳";
//     	String phone = "17607159421";
//     	String email = "wtc.wangtianci@gmail.com";
//     	String youbian = "236300";
     	
     	
     	String kaoshenghao = (String) request.getSession().getAttribute("kaoshenghao");//考生号
//     	kaoshenghao = "6";
     	/*
     	 * create table english4 (
			1	kaoshenghao int primary key,
			2	studentname text,
			3	sex text,
			4	year int,
			5	month int,
			6	day int,
			7	minzu text,
			8	jiguan text,
			9	xueli text,
			10	school text,
			11	address text,
			12	phone varchar(16),
			13	email varchar(30),
			14	youbian varchar(10)
			);
     	 * 
     	 */

     	Connection connect = null;
		PreparedStatement Statement = null;
		DBHelper.DB_driver();
		
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		    String sql1 = "INSERT INTO english4 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			Statement=connect.prepareStatement(sql1);
			
			Statement.setInt(1,Integer.parseInt(kaoshenghao));
			Statement.setString(2,name);
			Statement.setString(3,sex);
			Statement.setInt(4,Integer.parseInt(year));
			Statement.setInt(5,Integer.parseInt(month));
			Statement.setInt(6,Integer.parseInt(day));
			Statement.setString(7,minzu);
			Statement.setString(8,jiguan);
			Statement.setString(9,xueli);
			Statement.setString(10,school);
			Statement.setString(11,address);
			Statement.setString(12,phone);
			Statement.setString(13,email);
			Statement.setString(14,youbian);			
			Statement.executeUpdate();
			
			System.out.println("insert into english4 success");
			
			if(connect != null) connect.close();
			if(Statement != null) Statement.close();
		}catch(SQLException e)
		{
		}
		
     	connect  = null;
		Statement = null;
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		    String sql2 = "INSERT INTO baokaokemu VALUES (?,?);";
			Statement=connect.prepareStatement(sql2);
			
			Statement.setInt(1,Integer.parseInt(kaoshenghao));
			Statement.setInt(2,1);
			Statement.executeUpdate();
			
			System.out.println("insert into english4 success");
			
			if(connect != null) connect.close();
			if(Statement != null) Statement.close();
		}catch(SQLException e)
		{
		}
     
     	request.setAttribute("kaoshenghao",kaoshenghao);
     	request.getRequestDispatcher("fill_in_success.jsp").forward(request, response);//下一个页面的跳转
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
