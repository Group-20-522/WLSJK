package update;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class update_inServlet1
 */
@WebServlet("/update_inServlet1")
public class update_inServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_inServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

     	String schooladdress = request.getParameter("schooladdress");// 毕业院校
     	String address = (String)request.getParameter("address");//家庭住址
     	String phone = request.getParameter("phone");//个人号码
     	String email = request.getParameter("email");//email
     	String youbian = request.getParameter("post");//邮编
    	String kaoshenghao = (String) request.getSession().getAttribute("kaoshenghao");//考生号
     
    	System.out.println("考生号"+kaoshenghao);
     	
    	DBHelper.DB_driver();
    	try {
    		Connection connect = DriverManager.getConnection(DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
			String sql = "update english4 set address=?,phone=?,email=?,youbian=?,school=? where kaoshenghao='"+kaoshenghao+"';";
			PreparedStatement pst = connect.prepareStatement(sql);
			pst.setString(1,address);
			pst.setString(2,phone);
			pst.setString(3,email);
			pst.setString(4,youbian);
			pst.setString(5,schooladdress);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	
    	
    	
     	
     	
     	
     	
     	request.setAttribute("kaoshenghao",kaoshenghao);
		request.getRequestDispatcher("save_success.jsp").forward(request, response);//下一个页面的跳转
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
