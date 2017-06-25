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
 * Servlet implementation class inServlet5
 */
@WebServlet("/inServlet5")
public class inServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		/*全国会计资格考试考生信息记录*/
		String name = request.getParameter("studentname");//姓名
     	String sex = request.getParameter("sex");//性别
    	String year = request.getParameter("year"); //年
    	String month = request.getParameter("month"); //月
    	String day = request.getParameter("day"); //日
     	String minzu = request.getParameter("minzu");//民族
     	String jiguan = request.getParameter("jiguan");//籍贯
     	String schooladdress = request.getParameter("schooladdress");// 毕业院校
     	String zhuanye = request.getParameter("zhuanye");//专业
     	String xuelixingzhi = request.getParameter("xuelixingzhi");//学历性质
     	String dotime = request.getParameter("dotime");//工作年限
     	String baokaojibie = request.getParameter("baokaojibie");//报考级别
     	String zhiwu = request.getParameter("zhiwu");//所在岗位职务
     	String address = request.getParameter("address");//家庭住址
     	String phone = request.getParameter("grdh");//个人号码
     	String email = request.getParameter("email");//email
     	String youbian = request.getParameter("post");//邮编
     	String kaoshenghao = (String) request.getSession().getAttribute("testSession");//考生号
     	
     	
     	/*
     	 * 
     	 * 
     	 * 此部分做数据库连接，录入信息等
     	 * 
     	 * 
     	 * */
     	Connection connect = null;
		PreparedStatement Statement = null;
		DBHelper.DB_driver();
		
		try {
			connect = DriverManager.getConnection(
					DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
		    String sql1 = "INSERT INTO kuaiji VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			Statement=connect.prepareStatement(sql1);
			
			Statement.setInt(1,Integer.parseInt(kaoshenghao));
			Statement.setString(2,name);
			Statement.setString(3,sex);
			Statement.setInt(4,Integer.parseInt(year));
			Statement.setInt(5,Integer.parseInt(month));
			Statement.setInt(6,Integer.parseInt(day));
			Statement.setString(7,minzu);
			Statement.setString(8,jiguan);
			Statement.setString(9,schooladdress);
			Statement.setString(10,zhuanye);
			Statement.setString(11,xuelixingzhi);
			Statement.setInt(12,Integer.parseInt(dotime));
			Statement.setString(13,baokaojibie);
			Statement.setString(14,zhiwu);
			Statement.setString(15,address);
			Statement.setString(16,phone);
			Statement.setString(17,email);
			Statement.setString(18,youbian);			
			Statement.executeUpdate();
			
			System.out.println("insert into kuaiji success");
			
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
			Statement.setInt(2,5);
			Statement.executeUpdate();
			
			System.out.println("insert into english4 success");
			
			if(connect != null) connect.close();
			if(Statement != null) Statement.close();
		}catch(SQLException e)
		{
		}
     	
     	
     	
		
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
